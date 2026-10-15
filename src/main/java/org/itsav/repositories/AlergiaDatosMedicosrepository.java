package org.itsav.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import org.itsav.domain.entities.AlergiasDatosMedicos;
import org.itsav.domain.entities.AlergiasDatosMedicosId;

@ApplicationScoped
public class AlergiaDatosMedicosrepository implements PanacheRepositoryBase<AlergiasDatosMedicos, AlergiasDatosMedicosId>{
}
