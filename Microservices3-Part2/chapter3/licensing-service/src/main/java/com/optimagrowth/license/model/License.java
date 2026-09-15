package com.optimagrowth.license.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter @Setter @ToString @Entity
public class License {

	@Id 
    @GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	private String licenseId;
	private String description;
	private String organizationId;
	private String productName;
	private String licenseType;

}