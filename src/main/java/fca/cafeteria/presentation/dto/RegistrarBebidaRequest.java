package fca.cafeteria.presentation.dto;

import lombok.Getter;
import lombok.Setter;

public class RegistrarBebidaRequest {
    @Getter
    @Setter
    private String nombre;
    @Getter
    @Setter
    private String descripcion;
    @Getter
    @Setter
    private String tipoBebidaDescripcion;

}
