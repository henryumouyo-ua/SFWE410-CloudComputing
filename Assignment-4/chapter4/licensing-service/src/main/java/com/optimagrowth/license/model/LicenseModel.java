package com.optimagrowth.license.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.hateoas.RepresentationModel;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "licenses")
@Getter @Setter @ToString
public class LicenseModel extends RepresentationModel<LicenseModel> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "license_id")
    private int licenseId;

    @Column(name = "description")
    private String description;

    @Column(name = "organization_id")
    private String organizationId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "license_type")
    private String licenseType;
}