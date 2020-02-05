package attendance.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Registry {
    @Id
    @GeneratedValue
    private long id;

    private double GPA;

    @ManyToOne(cascade = CascadeType.ALL)
    private CourseOffering courseOffering;

    @ManyToOne(cascade = CascadeType.ALL)
    private Student student;
}
