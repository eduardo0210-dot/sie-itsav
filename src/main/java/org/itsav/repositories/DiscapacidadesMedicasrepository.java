package org.itsav.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import org.itsav.domain.entities.Discapacidades_Medicas;

@ApplicationScoped
public class DiscapacidadesMedicasrepository implements PanacheRepositoryBase<Discapacidades_Medicas, Integer>{
}
