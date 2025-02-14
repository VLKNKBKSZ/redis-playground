package org.vlkn.learning.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.vlkn.learning.domain.Person;

@ApplicationScoped
public class PersonRepository implements PanacheRepository<Person> {
}
