package app.profesor;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ProfesorService {

	private final ProfesorRepository profesorRepository;

	public List<Profesor> all() {
		return profesorRepository.findAll();
	}
}
