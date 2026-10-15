package org.itsav.service;

import org.itsav.domain.entities.Discapacidad_Dato_MedicoId;
import org.itsav.domain.entities.Discapacidades_Datos_Medicos;

import java.util.List;
public interface DiscapacidadesDatosMedicosService {
    List<Discapacidades_Datos_Medicos> findAll();

    Discapacidades_Datos_Medicos findById(Discapacidad_Dato_MedicoId id);
}
