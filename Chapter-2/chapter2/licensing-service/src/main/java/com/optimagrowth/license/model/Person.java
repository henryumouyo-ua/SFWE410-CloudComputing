package main.java.com.optimagrowth.license.model;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int personId; // can also use Long depending on size

    private String name;
    private String major;
    private String dept;
    private LocalDate dateOfBirth;
    private String phone;
    private String email;

    private Set<Organization> organizations = new HashSet<>();

    public Person() {
    }

    public Person(String name, String major, String dept,
                  LocalDate dateOfBirth, String phone, String email) {
        this.name = name;
        this.major = major;
        this.dept = dept;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Organization> getOrganizations() {
        return organizations;
    }

    public void addOrganization(Organization organization) {
        organizations.add(organization);
    }
}


