package Backend.Repositories;

import Backend.Models.Actividad;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ActividadRepository extends CrudRepository<Actividad, Integer> {
    @Override
    Iterable<Actividad> findAll();

    @Override
    <S extends Actividad> S save(S entity);

    @Override
    Optional<Actividad> findById(Integer integer);

    @Override
    void delete(Actividad entity);

}
