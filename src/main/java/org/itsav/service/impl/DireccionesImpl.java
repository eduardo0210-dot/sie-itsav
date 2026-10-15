
package org.itsav.service.impl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.itsav.domain.entities.Direcciones;
import org.itsav.repositories.Direccionesrepository;
import org.itsav.service.DireccionesService;

import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class DireccionesImpl implements DireccionesService {

    @Inject
    Direccionesrepository repository;

    @Override
    public List<Direcciones> findAll() {
        return repository.listAll();
    }

    @Override
    public Direcciones findById(UUID id) {
        return repository.findById(id);
    }
}
