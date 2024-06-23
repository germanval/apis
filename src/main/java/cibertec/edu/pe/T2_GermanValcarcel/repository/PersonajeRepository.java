package cibertec.edu.pe.T2_GermanValcarcel.repository;

import cibertec.edu.pe.T2_GermanValcarcel.model.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonajeRepository extends JpaRepository<Personaje,Integer> {
}
