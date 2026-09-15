package com.optimagrowth.license.repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.optimagrowth.license.model.License;

@Repository
public interface LicenseRepository extends JpaRepository<License, Integer>{

}
