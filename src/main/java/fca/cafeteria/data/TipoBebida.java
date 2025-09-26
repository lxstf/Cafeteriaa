package fca.cafeteria.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name =  "ttipobebida")
@NoArgsConstructor
@RequiredArgsConstructor
public class TipoBebida {
    @Id
    @Column(name = "id")
    @Getter @Setter
    private int  id;
    @Column(name = "descripcion")
    @Getter @Setter
    @NonNull
    private String descripcion;

}
