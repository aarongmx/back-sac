package app.horario;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/horarios")
public class HorarioController {
	private final HorarioService horarioService;
	
	@GetMapping
	public List<Horario> index() {
		return horarioService.all();
	}
}
