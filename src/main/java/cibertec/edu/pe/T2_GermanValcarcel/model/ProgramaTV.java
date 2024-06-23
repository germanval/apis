package cibertec.edu.pe.T2_GermanValcarcel.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@NoArgsConstructor
@Data
@Table(name = "programatv")
public class ProgramaTV {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idprogramatv;
    private String titulo;
    private String resumen;
    private Date fechainicio;
    private Integer idpersonaje;
}
