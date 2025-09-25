package fca.cafeteria.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name =  "ttipobebida")
public class TipoBebida {
    @Id
    @Column(name = "id")
    @Getter @Setter
    private int  id;
    @Column(name = "descripcion")
    @Getter @Setter
    private String descripcion;

}
