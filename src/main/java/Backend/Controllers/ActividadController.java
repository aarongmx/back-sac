package Backend.Controllers;

import Backend.Models.Actividad;
import Backend.Repositories.ActividadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/api/v1")
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class ActividadController {

    @Autowired
    ActividadRepository repository;

    @GetMapping("/actividades")
    public Iterable<Actividad> index() {
        return repository.findAll();
    }

    @GetMapping("/actividades/{id}")
    public Optional<Actividad> findById(@PathVariable Integer id) {
        return repository.findById(id);
    }

    @PostMapping(value = "/actividades", consumes = "application/json")
    public Actividad post(@RequestBody Actividad actividad) {
        return repository.save(actividad);
    }
}
