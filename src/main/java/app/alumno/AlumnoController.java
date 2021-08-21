package app.alumno;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/alumnos")
public class AlumnoController {

	private final AlumnoService alumnoService;

	@GetMapping
	public List<Alumno> index() {
		return alumnoService.all();
	}
	
	@PostMapping
	public void store(@RequestBody Alumno alumno) {
		alumnoService.addNewStudent(alumno);
	}
	
	@DeleteMapping(path = "{alumnoId}")
	public void destroy(@PathVariable("alumnoId") Long id) {
		alumnoService.deleteStudent(id);
	}
}
