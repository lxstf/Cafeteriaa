package fca.cafeteria.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TBebidaRepository extends JpaRepository<TipoBebida, Integer> {

        boolean existsByDescripcion(String descripcion);
        Optional <TipoBebida> findByDescripcion(String descripcion);
}
