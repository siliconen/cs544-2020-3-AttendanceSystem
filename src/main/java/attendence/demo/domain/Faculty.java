package attendence.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
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
