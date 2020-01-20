package Backend.Controllers;

import Backend.Models.Categoria;
import Backend.Repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/api/v1")
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class CategoriaController {

    @Autowired
    CategoriaRepository repository;

    @GetMapping("/categorias")
    public Iterable<Categoria> index() {
        return repository.findAll();
    }

    @GetMapping("/categorias/{id}")
    public Optional<Categoria> findByID(@PathVariable Integer id) {
        return repository.findById(id);
    }

    @PostMapping("/categoria")
    public Categoria save(@RequestBody Categoria categoria) {
        System.out.println(categoria);
        return repository.save(categoria);
    }
}
