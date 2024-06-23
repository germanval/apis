package cibertec.edu.pe.T2_GermanValcarcel.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@Table(name = "personaje")
public class Personaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer idpersonaje;
    private String nompersonaje;
    private String apepersonaje;
    private String fechnacpersonaje;

}
