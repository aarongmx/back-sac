package app.profesor;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/profesores")
public class ProfesorController {
	private final ProfesorService profesorService;
	
	@GetMapping
	public List<Profesor> index() {
		return profesorService.all();
	}
}
