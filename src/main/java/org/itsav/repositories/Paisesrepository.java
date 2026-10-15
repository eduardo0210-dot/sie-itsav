package org.itsav.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.itsav.domain.entities.Paises;

@ApplicationScoped
public class Paisesrepository implements PanacheRepository<Paises> {
}
