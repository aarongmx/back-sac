package app.alumno;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class AlumnoService {

	private final AlumnoRepository alumnoRepository;

	public List<Alumno> all() {
		return alumnoRepository.findAll();
	}
	
	
	public void addNewStudent(Alumno alumno) {
		
		alumnoRepository.save(alumno);
	}
	
	public void deleteStudent(Long id) {
		boolean exists = alumnoRepository.existsById(id);
		if (!exists) {
			throw new IllegalAccessError("El alumno con el id: " + id);
		}
		alumnoRepository.deleteById(id);
	}
	
}
