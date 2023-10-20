package com.example.demo.services;

import com.example.demo.models.Person;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonServImp implements PersonService{
    @Override
    public List<Person> getAll() {
        return List.of(
                new Person(1,"sudheer","naidu"),
                new Person(2,"thrinadh","busa"),
                new Person(3,"virat","kohli")

        );

    }

    @Override
    public Person getById(int id) {
       return new Person(id,"virat","kohli");
    }

    @Override
    public Person create(Person person) {
        person.setPersonId(101);
        return person;
    }

    @Override
    public Person update(int id, Person person) {

        return null;
    }

    @Override
    public void deleteById(int id) {

    }
}
