package app.actividad;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ActividadService {
	private final ActividadRepository actividadRepository;
	
	public List<Actividad> all() {
		return actividadRepository.findAll();
	}
}
