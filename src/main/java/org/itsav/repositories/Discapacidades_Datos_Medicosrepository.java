package org.itsav.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import org.itsav.domain.entities.Discapacidades_Datos_Medicos;
import org.itsav.domain.entities.Discapacidad_Dato_MedicoId;

@ApplicationScoped
public class Discapacidades_Datos_Medicosrepository implements PanacheRepositoryBase<Discapacidades_Datos_Medicos, Discapacidad_Dato_MedicoId> {
}
