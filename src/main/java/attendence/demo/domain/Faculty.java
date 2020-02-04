package attendence.demo.domain;


import javax.persistence.*;
import java.util.List;


@Entity
public class Faculty {
    @Id
    @GeneratedValue
    private long id;

    private String firstName;

    private String lastName;

    private String password;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "faculty")
    private List<CourseOffering> courseOfferings ;

}
