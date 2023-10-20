package com.example.demo.apis;

import com.example.demo.models.Person;
import com.example.demo.services.PersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/v1/persons")
public class PersonApi {
    private final PersonService service;
    public PersonApi(PersonService service)
    {
        this.service=service;

    }
    @GetMapping
    public ResponseEntity<List<Person>> getAll()
    {
       return ResponseEntity.ok(service.getAll());
    }
    @GetMapping("{id}")
    public ResponseEntity<Person> getById(@PathVariable int id)
    {
        return ResponseEntity.ok(service.getById(id));

    }
    @PostMapping
    public ResponseEntity<Person> create(@RequestBody Person person)
    {
        return ResponseEntity.ok(service.create(person));
    }
    @PutMapping("{id}")
    public ResponseEntity<Person> update(@PathVariable int id,@RequestBody Person person)
    {
        return ResponseEntity.ok(service.update(id,person));
    }
    @DeleteMapping("{id}")
    public ResponseEntity<?>deleteById(@PathVariable int id)
    {
        service.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
