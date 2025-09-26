package fca.cafeteria.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogoRepository extends JpaRepository <Bebida, Integer> {

    boolean existsByTipoBebida(TipoBebida tipoBebida);
    void guardarBebida();
    void guardarTipoBebida();
    void registrarBebida();


}
