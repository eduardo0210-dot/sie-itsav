package org.itsav.service;

import org.itsav.domain.entities.Paises;
import java.util.List;

public interface PaisesServices {
    List<Paises> findAll();

    Paises findById(Long id);
}
