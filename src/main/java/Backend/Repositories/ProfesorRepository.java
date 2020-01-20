package Backend.Repositories;

import Backend.Models.Profesor;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProfesorRepository extends CrudRepository<Profesor, Integer> {
    @Override
    Iterable<Profesor> findAll();

    @Override
    <S extends Profesor> S save(S entity);

    @Override
    Optional<Profesor> findById(Integer integer);

    @Override
    void delete(Profesor entity);
}
