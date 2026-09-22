package com.optimagrowth.license.controller;
import com.optimagrowth.license.model.Organization;
import com.optimagrowth.license.model.Person;
import com.optimagrowth.license.repository.OrganizationRepository;
import com.optimagrowth.license.repository.PersonRepository;

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
    public List<Organization> getOrganization() {
        return OrganizationRepository.findAll();
    }
}
