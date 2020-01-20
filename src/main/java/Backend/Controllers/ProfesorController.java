package Backend.Controllers;

import Backend.Models.Profesor;
import Backend.Repositories.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/v1")
public class ProfesorController {

    @Autowired
    ProfesorRepository repository;

    @GetMapping("/profesores")
    public Iterable<Profesor> index() {
        return repository.findAll();
    }

    @GetMapping("/profesores/{id}")
    public Optional<Profesor> findByID(@PathVariable Integer id) {
        return repository.findById(id);
    }

    @PostMapping(value = "/profesores", consumes = "application/json")
    public Profesor post(@RequestBody Profesor profesor) {
        return repository.save(profesor);
    }

}
