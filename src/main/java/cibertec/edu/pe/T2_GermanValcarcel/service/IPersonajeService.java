package cibertec.edu.pe.T2_GermanValcarcel.service;


import cibertec.edu.pe.T2_GermanValcarcel.model.Personaje;

import java.util.List;
import java.util.Optional;

public interface IPersonajeService {

List<Personaje> listarPersonajes();
Optional<Personaje> obtenerPersonajesxid(Integer id);
Personaje guardarpersonaje(Personaje personaje);
}
