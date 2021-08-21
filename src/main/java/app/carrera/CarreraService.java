package app.carrera;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CarreraService {
	private final CarreraRepository carreraRepository;

	public List<Carrera> all() {
		return carreraRepository.findAll();
	}

}
