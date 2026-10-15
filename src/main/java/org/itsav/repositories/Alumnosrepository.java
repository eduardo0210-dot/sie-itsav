
package org.itsav.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import org.itsav.domain.entities.Alumnos;

import java.util.UUID;
import java.util.Optional;
import java.util.List;

@ApplicationScoped
public class Alumnosrepository
        implements PanacheRepositoryBase<Alumnos, UUID> {

    public Optional<Alumnos> buscarPorNumeroControl(String numControl) {
        return find("numControl", numControl)
                .firstResultOptional();
    }


    // Obtener únicamente alumnos activos
    public List<Alumnos> buscarAlumnosActivos() {
        return list("activo", true);
    }

    // Obtener únicamente alumnos inactivos
    public List<Alumnos> buscarAlumnosInactivos() {
        return list("activo", false);
    }

}
