package org.itsav.service.impl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.itsav.domain.entities.Paises;
import org.itsav.repositories.Paisesrepository;
import org.itsav.service.PaisesServices;

import java.util.List;

@ApplicationScoped
public class PaisesServiceImpl implements PaisesServices {
    @Inject
    Paisesrepository repository;

    @Override
    public List<Paises> findAll() {
        return repository.listAll();
    }

    @Override
    public Paises findById(Long id) {
        return repository.findById(id);
    }
}
