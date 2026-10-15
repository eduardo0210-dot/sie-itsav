package org.itsav.service;

import org.itsav.domain.entities.AlergiasDatosMedicos;
import org.itsav.domain.entities.AlergiasDatosMedicosId;

import java.util.List;
public interface AlergiaDatosmedicosService {
    List<AlergiasDatosMedicos> findAll();

    AlergiasDatosMedicos findById(AlergiasDatosMedicosId id);
}
