
package org.itsav.service.impl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import org.itsav.domain.entities.DatosMedicos;
import org.itsav.repositories.DatosMedicosrepository;
import org.itsav.service.DatosMedicosService;

import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class DatosMedicosServiceImpl implements DatosMedicosService {

    @Inject
    DatosMedicosrepository repository;

    @Override
    public List<DatosMedicos> findAll() {
        return repository.listAll();
    }

    @Override
    public DatosMedicos findById(UUID id) {
        return repository.findById(id);
    }
}

