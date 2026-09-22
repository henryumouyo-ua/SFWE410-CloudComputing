package com.optimagrowth.license.model;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.time.LocalDate;
import lombok.Data;
import javax.validation.constraints.NotNull;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;

@SpringBootApplication
@Entity
@Table(name = "person")
@Data
@AllArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // can also use Long depending on size

    @NotNull(message = "Full name is required")
    @Column(nullable = false)
    private String name;

    @NotNull(message = "major is required")
    @Column(nullable = false)
    private String major;

    @NotNull(message = "department is required")
    @Column(nullable = false)
    private String dept;

    @NotNull(message = "dateOfBirth date is required")
    @Column(nullable = false)
    private LocalDate dateOfBirth;

    @NotNull(message = "phone is required")
    @Column(nullable = false)
    private String phone;

    @NotNull(message = "Email is required")
    @NotNull(message = "Email must be valid")
    @Column(nullable = false, unique = true)
    private String email;

  
}




