package Backend.Controllers;

import Backend.Models.Alumno;
import Backend.Repositories.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/api/v1")
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class AlumnoController {

    @Autowired
    AlumnoRepository repository;

    @RequestMapping("/alumnos")
    public Iterable<Alumno> index() {
        return repository.findAll();
    }

    @RequestMapping("/alumnos/{id}")
    public Optional<Alumno> getById(@PathVariable Integer id) {
        return repository.findById(id);
    }

    @PostMapping(value = "/alumnos", consumes = "application/json")
    public Alumno save(@RequestBody Alumno alumno) {
        return repository.save(alumno);
    }
}
