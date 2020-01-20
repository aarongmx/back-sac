package Backend.Controllers;

import Backend.Models.Carrera;
import Backend.Repositories.CarreraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/api/v1")
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class CarreraController {
    @Autowired
    CarreraRepository repository;

    @GetMapping("/carreras")
    public Iterable<Carrera> index() {
        return repository.findAll();
    }

    @GetMapping("/carreras/{id}")
    public Optional<Carrera> findByID(@PathVariable String id) {
        return repository.findById(id);
    }
}
