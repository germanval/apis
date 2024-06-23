package cibertec.edu.pe.T2_GermanValcarcel.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "programatv")
public class ProgramaTV {
    private Integer idprogramatv;
    private String titulo;
    private String resumen;
    private Date fechainicio;
    private Integer idpersonaje;
}
