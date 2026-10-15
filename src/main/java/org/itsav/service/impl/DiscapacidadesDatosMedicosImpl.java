
package org.itsav.service.impl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.itsav.domain.entities.Discapacidades_Datos_Medicos;
import org.itsav.domain.entities.Discapacidad_Dato_MedicoId;
import org.itsav.repositories.Discapacidades_Datos_Medicosrepository;
import org.itsav.service.DiscapacidadesDatosMedicosService;

import java.util.List;

@ApplicationScoped
public class DiscapacidadesDatosMedicosImpl
        implements DiscapacidadesDatosMedicosService {

    @Inject
    Discapacidades_Datos_Medicosrepository repository;

    @Override
    public List<Discapacidades_Datos_Medicos> findAll() {
        return repository.listAll();
    }

    @Override
    public Discapacidades_Datos_Medicos findById(
            Discapacidad_Dato_MedicoId id) {
        return repository.findById(id);
    }
}
