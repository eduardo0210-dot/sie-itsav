package org.itsav.service.impl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.itsav.domain.entities.Ciudades;
import org.itsav.repositories.Ciudadesrepository;
import org.itsav.service.CiudadesService;

import java.util.List;

@ApplicationScoped
public class CiudadesServiceImpl implements CiudadesService {
    @Inject
    Ciudadesrepository repository;

    @Override
    public List<Ciudades> findAll() {
        return repository.listAll();
    }

    @Override
    public Ciudades findById(Long id){
        return repository.findById(id);
    }
}
