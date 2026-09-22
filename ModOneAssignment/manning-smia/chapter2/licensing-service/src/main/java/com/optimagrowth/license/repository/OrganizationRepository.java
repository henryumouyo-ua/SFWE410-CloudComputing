package com.optimagrowth.license.repository;
import com.optimagrowth.license.model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {
    List<Organization> findByNameIgnoreCase(String name);
    List<Organization> findByIdOrganizationsIgnoreCase(Long idLong);
}

