package org.itsav.service.impl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.itsav.domain.entities.Estados;
import org.itsav.repositories.Estadosrepository;
import org.itsav.service.EstadosService;

import java.util.List;

@ApplicationScoped
public class EstadosServiceImpl implements EstadosService{
    @Inject
    Estadosrepository repository;

    @Override
    public List<Estados> findAll() {
        return repository.listAll();
    }

    @Override
    public Estados findById(Long id) {
        return repository.findById(id);
    }
}
