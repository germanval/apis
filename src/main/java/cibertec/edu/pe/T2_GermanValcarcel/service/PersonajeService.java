package cibertec.edu.pe.T2_GermanValcarcel.service;

import cibertec.edu.pe.T2_GermanValcarcel.model.Personaje;
import cibertec.edu.pe.T2_GermanValcarcel.repository.PersonajeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PersonajeService implements IPersonajeService{
    private PersonajeRepository personajeRepository;
    @Override
    public List<Personaje> listarPersonajes() {
        return personajeRepository.findAll();
    }

    @Override
    public Optional<Personaje> obtenerPersonajesxid(Integer id) {
Optional<Personaje>personaje=personajeRepository.findById(id);
    if(personaje.isEmpty()){
    return Optional.empty();
        }
return personaje;
    }

    @Override
    public Personaje guardarpersonaje(Personaje personaje) {
        return personajeRepository.save(personaje);
    }
}
