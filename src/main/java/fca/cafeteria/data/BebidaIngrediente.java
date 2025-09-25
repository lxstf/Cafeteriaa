package fca.cafeteria.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbebidaingrediente")
public class BebidaIngrediente {
    @Id
    @Column(name = "idbebida")
    @Getter @Setter
   private int  idbebidaIngrediente;
    @Column(name = "idbebida")
    @Getter @Setter
    private int idBebida;
    @Column(name = "idingrediente")
    @Getter @Setter
   private int idIngrediente;
    @Column(name = "cantidad")
    @Getter @Setter
   private int cantidad;

}
