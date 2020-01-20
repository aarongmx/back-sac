package Backend.Repositories;

import Backend.Models.Alumno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AlumnoRepository extends CrudRepository<Alumno, Integer> {
    @Override
    Iterable<Alumno> findAll();

    @Override
    <S extends Alumno> S save(S entity);

    @Override
    Optional<Alumno> findById(Integer integer);

    @Override
    void delete(Alumno entity);
}
