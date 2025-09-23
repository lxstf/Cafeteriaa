package fca.cafeteria.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbebidaingrediente")
public class BebidaIngrediente {
    @Id
    @Column(name = "idbebida")
   private int  idbebidaIngrediente;
    @Column(name = "idbebida")
    private int idBebida;
    @Column(name = "idingrediente")
   private int idIngrediente;
    @Column(name = "cantidad")
   private int cantidad;

}
