package Backend.Repositories;

import Backend.Models.Categoria;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaRepository extends CrudRepository<Categoria, Integer> {
    @Override
    Iterable<Categoria> findAll();

    @Override
    <S extends Categoria> S save(S entity);

    @Override
    void delete(Categoria entity);
}
