package app.carrera;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/carreras")
public class CarreraController {
	private final CarreraService carreraService;
	
	@GetMapping
	public List<Carrera> index() {
		return carreraService.all();
	}
}
