package org.itsav.service.impl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.itsav.domain.entities.Discapacidades_Medicas;
import org.itsav.repositories.DiscapacidadesMedicasrepository;
import org.itsav.service.DiscapacidadesMedicasService;

import java.util.List;

@ApplicationScoped
public class DiscapacidadesMedicasServiceImpl implements DiscapacidadesMedicasService {
    @Inject
    DiscapacidadesMedicasrepository repository;

    @Override
    public List<Discapacidades_Medicas> findAll() {
        return repository.listAll();
    }

    @Override
    public Discapacidades_Medicas findById(Integer id) {
        return repository.findById(id);
    }
}
