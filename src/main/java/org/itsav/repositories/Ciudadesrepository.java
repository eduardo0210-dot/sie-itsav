
package org.itsav.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.itsav.domain.entities.Ciudades;

@ApplicationScoped
public class Ciudadesrepository implements PanacheRepository<Ciudades> {
}
