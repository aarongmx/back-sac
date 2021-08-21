package app.horario;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class HorarioService {
	private final HorarioRepository horarioRepository;

	public List<Horario> all() {
		return horarioRepository.findAll();
	}
}
