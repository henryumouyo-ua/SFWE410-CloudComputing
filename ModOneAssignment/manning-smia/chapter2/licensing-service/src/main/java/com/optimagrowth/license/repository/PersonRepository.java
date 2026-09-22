package com.optimagrowth.license.repository;
import com.optimagrowth.license.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface PersonRepository extends JpaRepository<Person, Long> {
     List<Person> findByPersonIdIgnoreCase(Long personId);
     List<Person> findByNameIgnoreCase(String name);
}

