package com.optimagrowth.license;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.optimagrowth.license.model;
import com.optimagrowth.license.repository;
import com.optimagrowth.license.controller;
import java.time.LocalDate;
import java.util;
import java.util.HashSet;
import java.util.Set;


@SpringBootApplication
@Import({com.optimagrowth.organization.license.model.Organization.class, com.optimagrowth.license.model.Person.class})
public class LicenseServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(LicenseServiceApplication.class, args);
        
        
	}

    
}

public enum Category {
    Sports,
    Fitness,
    Arts,
    Literature
}

