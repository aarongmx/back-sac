package Backend.Controllers;

import Backend.Models.Expediente;
import Backend.Repositories.ExpedienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/v1")
public class ExpedienteController {

    @Autowired
    ExpedienteRepository repository;

    @RequestMapping("/expedientes")
    public Iterable<Expediente> index() {
        return repository.findAll();
    }

    @RequestMapping("/expedientes/{noCtl}")
    public Iterable<Expediente> findStudent(@PathVariable Integer noCtl) {
        return repository.findStudent(noCtl);
    }

    @PostMapping(value = "/expedientes", consumes = "application/json")
    public Expediente save(@RequestBody Expediente expediente) {
        return repository.save(expediente);
    }

    @PutMapping(value = "/expedientes/{id}", consumes = "application/json")
    public Optional<Expediente> update(@PathVariable Integer id, @RequestBody Expediente expediente) {
        System.out.println(expediente);
        return repository.findById(id).map(exp -> {
            exp.setNoOficio(expediente.getNoOficio());
            exp.setFechaExpedicion(expediente.getFechaExpedicion());
            exp.setCalificacion(expediente.getCalificacion());
            exp.setPeriodo(expediente.getPeriodo());
            exp.setFinalizada(true);
            return  repository.save(exp);
        });
    }

}
