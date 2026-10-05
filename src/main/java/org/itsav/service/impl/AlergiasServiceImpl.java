package org.itsav.service.impl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.itsav.domain.entities.Alergia;
import org.itsav.repositories.Alergiasrepository;
import org.itsav.service.AlergiasService;

import java.util.List;

@ApplicationScoped
public class AlergiasServiceImpl implements AlergiasService {
    @Inject
    Alergiasrepository alergiasrepositoryepository;

    @Override
    public List<Alergia> findAll() {
        return alergiasrepositoryepository.findAll().stream().toList();
    }

    @Override
    public Alergia findById(Integer id) {
        return null;
    }
}
