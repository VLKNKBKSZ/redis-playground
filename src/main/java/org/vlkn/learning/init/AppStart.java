package org.vlkn.learning.init;

import io.quarkus.runtime.Startup;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import org.vlkn.learning.domain.Person;
import org.vlkn.learning.repository.PersonRepository;

@ApplicationScoped
public class AppStart {

    private final PersonRepository personRepository;

    public AppStart(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Transactional
    @Startup
    void init() {
        for (int i = 0; i < 100; i++) {
            Person person = new Person();
            person.setAge(1 + i);
            person.setName("Sjaak" + i);
            person.setEmail("sjaak1234@gmail.com" + i);
            person.setSurname("Vlaanderen" + i);

            personRepository.persist(person);
        }

    }
}
