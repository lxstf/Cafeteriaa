package fca.cafeteria.presentation;

import fca.cafeteria.data.Bebida;
import fca.cafeteria.data.TipoBebida;
import fca.cafeteria.domain.CatalogoService;
import fca.cafeteria.presentation.dto.RegistrarBebidaRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/cafeteria")
public class CatalogoController {

    @Autowired
    private CatalogoService  catalogoService;

    @RequestMapping("/cafeteria/agregarBebida")
    @ResponseBody
    public ResponseEntity<String> registrarbebida(RegistrarBebidaRequest registrar){

        TipoBebida tipo = new TipoBebida(registrar.getTipoBebidaDescripcion());


        catalogoService.registrarBebida(
                registrar.getNombre(),
                registrar.getDescripcion(),
                tipo
        );

        return ResponseEntity.ok("Bebida registrada exitosamente");
    }


    }


