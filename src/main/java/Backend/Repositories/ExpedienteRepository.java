package Backend.Repositories;

import Backend.Models.Expediente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpedienteRepository extends CrudRepository<Expediente, Integer> {
    @Override
    Iterable<Expediente> findAll();

    @Override
    <S extends Expediente> S save(S entity);

    Iterable<Expediente> findStudent(Integer noCtl);

    @Override
    void delete(Expediente entity);
}
