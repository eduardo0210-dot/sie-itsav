package org.itsav.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import org.itsav.domain.entities.AlumnosDirecciones;
import org.itsav.domain.entities.AlumnosDireccionesId;

@ApplicationScoped
public class AlumnosDireccionesrepository implements PanacheRepositoryBase<AlumnosDirecciones, AlumnosDireccionesId>{
}
