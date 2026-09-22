package com.optimagrowth.license.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;
import javax.validation.constraints.NotNull;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
@Entity
@Table(name = "organization")
@Data
@AllArgsConstructor
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //can also use Long depending on size


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organization_id", nullable = false)
    @NotNull(message = "Organization is required")
    private String name;

    @Enumerated(EnumType.STRING)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    @NotNull(message = "Category is required")
    private Category category;


    @NotNull(message = "EstablishedDate date is required")
    @Column(nullable = false)
    private LocalDateTime establishedDate;

    // Each organization has exactly one president

    
    @Column(name = "person_id", nullable = false)
    @NotNull(message = "President is required")
    private Person president;

    
    // An organization can have many members
    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<Person> members = new ArrayList<>();

    @PrePersist
    protected void onCreate() {
        this.establishedDate = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        this.establishedDate = LocalDateTime.now();
    }

}