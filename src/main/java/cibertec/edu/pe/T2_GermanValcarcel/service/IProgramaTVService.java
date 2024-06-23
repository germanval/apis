package cibertec.edu.pe.T2_GermanValcarcel.service;

import cibertec.edu.pe.T2_GermanValcarcel.model.ProgramaTV;

import java.util.List;
import java.util.Optional;

public interface IProgramaTVService {
    List<ProgramaTV> listarProgramaTV();
    Optional<ProgramaTV> obtenerProgramaTVxid(Integer id);
    ProgramaTV guardarProgramaTV(ProgramaTV programaTV);
}
