package fca.cafeteria.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;
@Entity
@Table(name = "tbebida")
public class Bebida {
    @Id
    @Column(name ="id")
    private int id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;
    private List<BebidaIngrediente> ingredientes;
    @Column(name = "idtipobebida")
    private int tipoBebida;

}
