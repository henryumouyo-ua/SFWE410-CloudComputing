package main.java.com.optimagrowth.license.model;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
@Entity
@Table(name = "organization")
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orgId; //can also use Long depending on size

    private String name;
    private Category category;
    private LocalDate establishedDate;

    // Each organization has exactly one president
    private Person president;

    // An organization can have many members
    private Set<Person> members = new HashSet<>();

    public Organization() {
    }

    public Organization(String name, Category category,
                        LocalDate establishedDate) {
        this.name = name;
        this.category = category;
        this.establishedDate = establishedDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public LocalDate getEstablishedDate() {
        return establishedDate;
    }

    public void setEstablishedDate(LocalDate establishedDate) {
        this.establishedDate = establishedDate;
    }

    public Person getPresident() {
        return president;
    }

    public void setPresident(Person president) {
        this.president = president;
    }

    public Set<Person> getMembers() {
        return members;
    }

    public void addMember(Person person) {
        members.add(person);
        person.addOrganization(this);
    }
}