package main.java.com.optimagrowth.license.repository;
import main.java.com.optimagrowth.license.model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {
}

