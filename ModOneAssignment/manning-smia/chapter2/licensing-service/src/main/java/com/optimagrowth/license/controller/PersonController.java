package com.optimagrowth.license.controller;
import com.optimagrowth.license.model.Person;
import com.optimagrowth.license.repository.PersonRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/person")

public class PersonController {
    private final PersonRepository PersonRepository;

    public PersonController(PersonRepository pRepository) {
        this.PersonRepository = pRepository;
    }

    @GetMapping
    public List<Person> getPersons() {
        return PersonRepository.findAll();
    }
}
