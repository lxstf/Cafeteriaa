package fca.cafeteria.domain;


import fca.cafeteria.data.Bebida;
import fca.cafeteria.data.CatalogoRepository;
import fca.cafeteria.data.TBebidaRepository;
import fca.cafeteria.data.TipoBebida;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogoService {

    @Autowired
    private CatalogoRepository catalogoRepository;

    @Autowired
    private TBebidaRepository tbebidaRepository;

    public void registrarBebida (String nombre, String descripcion,TipoBebida tipoBebida) {
        TipoBebida tipoAsociado;

        if (tbebidaRepository.existsByDescripcion(tipoBebida.getDescripcion())){
            //bebida = new Bebida(nombre, descripcion);
            tipoAsociado  = tbebidaRepository.findByDescripcion(tipoBebida.getDescripcion()).get();

        }else {
            tipoAsociado = tbebidaRepository.save(tipoBebida);
        }

        Bebida bebida = new Bebida(nombre,descripcion);
        bebida.setTipoBebida(tipoAsociado);
        catalogoRepository.save(bebida);

    }
}