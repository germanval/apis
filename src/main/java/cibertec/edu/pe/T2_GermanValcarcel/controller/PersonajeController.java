package cibertec.edu.pe.T2_GermanValcarcel.controller;

import cibertec.edu.pe.T2_GermanValcarcel.exception.ResourceNotFoundException;
import cibertec.edu.pe.T2_GermanValcarcel.model.Personaje;
import cibertec.edu.pe.T2_GermanValcarcel.service.PersonajeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path = "api/v2/personaje")
public class PersonajeController {

private PersonajeService personajeService;

@GetMapping("")
public ResponseEntity<List<Personaje>> listarPersonaje(){
    List<Personaje>personajeList=new ArrayList<>(personajeService.listarPersonajes());
    if(personajeList.isEmpty()){
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
}
    return new ResponseEntity<>(personajeList,HttpStatus.OK);
}

@GetMapping("/{id}")
public ResponseEntity<Personaje> obtenerperonsajesxid(@PathVariable Integer id){
Personaje personaje=personajeService.obtenerPersonajesxid(id).orElseThrow(()-> new ResourceNotFoundException("El personaje con id"+
        id+"no existe"));
return new ResponseEntity<>(personaje,HttpStatus.OK);

}

   @PostMapping("")
   public ResponseEntity<Personaje> registrarPersonaje(@RequestBody Personaje personaje){
           return new ResponseEntity<>(personajeService.guardarpersonaje(personaje),HttpStatus.CREATED);
   }
@PutMapping("/{id}")
public ResponseEntity<Personaje> actualizarPersonaje(@PathVariable Integer id,@RequestBody Personaje personaje){
                Personaje newpersonaje=personajeService.obtenerPersonajesxid(id)
                        .orElseThrow(()-> new ResourceNotFoundException("El personaje con id"+id+"no existe"));
        newpersonaje.setNompersonaje(personaje.getNompersonaje());
        newpersonaje.setApepersonaje(personaje.getApepersonaje());
        newpersonaje.setFechnacpersonaje(personaje.getFechnacpersonaje());
        return new ResponseEntity<>(personajeService.guardarpersonaje(newpersonaje),HttpStatus.OK);
        }

}
