package org.vlkn.learning.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Person {
    private String name;
    private String surname;
    private int age;
    private String email;
    @Id
    @GeneratedValue
    private Long id;
}
