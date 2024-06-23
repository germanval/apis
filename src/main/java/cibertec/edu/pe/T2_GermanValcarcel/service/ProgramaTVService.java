package cibertec.edu.pe.T2_GermanValcarcel.service;

import cibertec.edu.pe.T2_GermanValcarcel.model.Personaje;
import cibertec.edu.pe.T2_GermanValcarcel.model.ProgramaTV;
import cibertec.edu.pe.T2_GermanValcarcel.repository.ProgramatvRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProgramaTVService implements IProgramaTVService {

    private ProgramatvRepository programatvRepository;
    @Override
    public List<ProgramaTV> listarProgramaTV() {
        return programatvRepository.findAll();
    }

    @Override
    public Optional<ProgramaTV> obtenerProgramaTVxid(Integer id) {
        Optional<ProgramaTV>programaTV=programatvRepository.findById(id);
        if(programaTV.isEmpty()){
            return Optional.empty();
        }
        return programaTV;
    }

    @Override
    public ProgramaTV guardarProgramaTV(ProgramaTV programaTV) {
        return programatvRepository.save(programaTV);
    }
}
