package org.itsav.service;

import org.itsav.domain.entities.Discapacidades_Medicas;
import java.util.List;

public interface DiscapacidadesMedicasService {
    List<Discapacidades_Medicas> findAll();

    Discapacidades_Medicas findById(Integer id);
}
