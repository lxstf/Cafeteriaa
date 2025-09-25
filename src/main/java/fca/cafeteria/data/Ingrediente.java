package fca.cafeteria.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tingrediente")
public class Ingrediente {
    @Id
    @Column(name = "id")
    @Getter @Setter
    private int  id;
    @Column(name = "nombre")
    @Getter @Setter
    private String nombre;
    @Column(name = "descripcion")
    @Getter @Setter
    private String descripcion;
    @Column(name = "costo")
    @Getter @Setter
    private float costo;
}
