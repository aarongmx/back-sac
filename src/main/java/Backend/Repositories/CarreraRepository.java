package Backend.Repositories;

import Backend.Models.Carrera;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarreraRepository extends CrudRepository<Carrera, String> {
    @Override
    Iterable<Carrera> findAll();

    @Override
    <S extends Carrera> S save(S entity);

    @Override
    Optional<Carrera> findById(String id);

    @Override
    void delete(Carrera entity);
}
