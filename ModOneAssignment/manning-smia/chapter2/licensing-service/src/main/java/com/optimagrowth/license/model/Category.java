package com.optimagrowth.license.model;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.Data;
import javax.validation.constraints.NotNull;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;


@SpringBootApplication
@Entity
@Table(name = "category")
@Data
@AllArgsConstructor

public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; // can also use Long depending on size

    @NotNull(message = "Sport name is required")
    @Column(nullable = false)
    private String sport =    CategoryType.Sports.toString();

    @NotNull(message = "fitness is required")
    @Column(nullable = false)
    private String fitness = CategoryType.Fitness.toString();

    @NotNull(message = "Arts is required")
    @Column(nullable = false)
    private String arts =    CategoryType.Arts.toString();

    @NotNull(message = "literature is required")
    @Column(nullable = false)
    private String literature =    CategoryType.Literature.toString();

}
