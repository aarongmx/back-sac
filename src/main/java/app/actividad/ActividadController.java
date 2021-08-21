package app.actividad;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/actividades")
public class ActividadController {
	private final ActividadService actividadService;
	
	@GetMapping
	public List<Actividad> index() {
		return actividadService.all();
	}
}
