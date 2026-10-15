package org.itsav.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.itsav.domain.entities.Estados;

@ApplicationScoped
public class Estadosrepository implements PanacheRepository<Estados>{
}
