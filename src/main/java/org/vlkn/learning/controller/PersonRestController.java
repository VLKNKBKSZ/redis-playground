package org.vlkn.learning.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.vlkn.learning.domain.Person;
import org.vlkn.learning.repository.PersonRepository;

import java.util.List;

@Path("/persons")
public class PersonRestController {

    private final PersonRepository personRepository;

    public PersonRestController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GET
    public List<Person> getPersons() {
        return personRepository.findAll().list();
    }
}
