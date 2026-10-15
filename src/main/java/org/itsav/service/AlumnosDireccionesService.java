package org.itsav.service;

import org.itsav.domain.entities.AlumnosDirecciones;
import org.itsav.domain.entities.AlumnosDireccionesId;

import java.util.List;
public interface AlumnosDireccionesService {
    List<AlumnosDirecciones> findAll();

    AlumnosDirecciones findById(AlumnosDireccionesId id);
}
