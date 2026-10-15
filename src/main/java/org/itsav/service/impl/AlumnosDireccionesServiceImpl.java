
package org.itsav.service.impl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import org.itsav.domain.entities.AlumnosDirecciones;
import org.itsav.domain.entities.AlumnosDireccionesId;
import org.itsav.repositories.AlumnosDireccionesrepository;
import org.itsav.service.AlumnosDireccionesService;

import java.util.List;

@ApplicationScoped
public class AlumnosDireccionesServiceImpl implements AlumnosDireccionesService {

    @Inject
    AlumnosDireccionesrepository repository;

    @Override
    public List<AlumnosDirecciones> findAll() {
        return repository.listAll();
    }

    @Override
    public AlumnosDirecciones findById(AlumnosDireccionesId id) {
        return repository.findById(id);
    }
}
