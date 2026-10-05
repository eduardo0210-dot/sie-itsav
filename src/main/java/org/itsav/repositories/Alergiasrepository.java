package org.itsav.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import org.itsav.domain.entities.Alergia;

@ApplicationScoped
public class Alergiasrepository implements PanacheRepositoryBase<Alergia, Integer> {
}
