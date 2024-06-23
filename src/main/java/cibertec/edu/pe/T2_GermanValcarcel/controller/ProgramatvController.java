package cibertec.edu.pe.T2_GermanValcarcel.controller;

import cibertec.edu.pe.T2_GermanValcarcel.exception.ResourceNotFoundException;
import cibertec.edu.pe.T2_GermanValcarcel.model.Personaje;
import cibertec.edu.pe.T2_GermanValcarcel.model.ProgramaTV;
import cibertec.edu.pe.T2_GermanValcarcel.service.PersonajeService;
import cibertec.edu.pe.T2_GermanValcarcel.service.ProgramaTVService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path = "api/v2/programatv")
public class ProgramatvController {
    private ProgramaTVService programaTVService;

    @GetMapping("")
    public ResponseEntity<List<ProgramaTV>> listarProgramaTV(){
        List<ProgramaTV>programaTVList=new ArrayList<>(programaTVService.listarProgramaTV());
        if(programaTVList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(programaTVList,HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProgramaTV> obtenerProgramaTVxid(@PathVariable Integer id){
        ProgramaTV programaTV=programaTVService.obtenerProgramaTVxid(id).orElseThrow(()-> new ResourceNotFoundException("El personaje con id"+
                id+"no existe"));
        return new ResponseEntity<>(programaTV,HttpStatus.OK);

    }
    @PostMapping("")
    public ResponseEntity<ProgramaTV> registrarProgramaTV(@RequestBody ProgramaTV programaTV){
        return new ResponseEntity<>(programaTVService.guardarProgramaTV(programaTV),HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<ProgramaTV> actualizarProgramaTV(@PathVariable Integer id,@RequestBody ProgramaTV programaTV){
        ProgramaTV newprogramatv=programaTVService.obtenerProgramaTVxid(id)
                .orElseThrow(()-> new ResourceNotFoundException("El personaje con id"+id+"no existe"));
        newprogramatv.setTitulo(programaTV.getTitulo());
        newprogramatv.setResumen(programaTV.getResumen());
        newprogramatv.setFechainicio(programaTV.getFechainicio());
        newprogramatv.setIdpersonaje(programaTV.getIdpersonaje());
        return new ResponseEntity<>(programaTVService.guardarProgramaTV(newprogramatv),HttpStatus.OK);
    }

}
