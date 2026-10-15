package org.itsav.service.impl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import org.itsav.domain.entities.AlergiasDatosMedicos;
import org.itsav.domain.entities.AlergiasDatosMedicosId;
import org.itsav.repositories.AlergiaDatosMedicosrepository;
import org.itsav.service.AlergiaDatosmedicosService;

import java.util.List;

@ApplicationScoped
public class AlergiasDatosMedicosImpl implements AlergiaDatosmedicosService{
    @Inject
    AlergiaDatosMedicosrepository repository;

    @Override
    public List<AlergiasDatosMedicos> findAll() {
        return repository.listAll();
    }

    @Override
    public AlergiasDatosMedicos findById(
            AlergiasDatosMedicosId id) {
        return repository.findById(id);
    }
}
