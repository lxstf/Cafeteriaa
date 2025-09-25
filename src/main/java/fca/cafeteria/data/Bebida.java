package fca.cafeteria.data;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Entity
@Table(name = "tbebida")
@NoArgsConstructor
@RequiredArgsConstructor
public class Bebida {

    @Id
    @Column(name ="id")
    @Getter @Setter
    @NonNull
    public Integer id;
    @Column(name = "nombre")
    @NonNull
    @Getter @Setter
    private String nombre;
    @Column(name = "descripcion")
    @Getter @Setter
    private String descripcion;
    @ManyToMany
    private List<BebidaIngrediente> ingredientes;
    @Column(name = "idtipobebida")
    @Getter @Setter
    private int tipoBebida;


}
