package fca.cafeteria.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name =  "ttipobebida")
public class TipoBebida {
    @Id
    @Column(name = "id")
    private int  id;
    @Column(name = "descripcion")
    private String descripcion;

}
