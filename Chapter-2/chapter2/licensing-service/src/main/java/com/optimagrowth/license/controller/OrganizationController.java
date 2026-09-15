package main.java.com.optimagrowth.license.controller;
import main.java.com.optimagrowth.license.model.Organization;
import main.java.com.optimagrowth.license.model.Person;
import main.java.com.optimagrowth.license.repository.OrganizationRepository;
import main.java.com.optimagrowth.license.repository.PersonRepository;

import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/orgamization")

public class OrganizationController {
    private final OrganizationRepository OrganizationRepository;

    public OrganizationController(OrganizationRepository oRepository) {
        this.OrganizationRepository = oRepository;
    }

    @GetMapping
    public List<OrganizationRepository> getOrganization() {
        return OrganizationRepository.findAll();
    }
}
