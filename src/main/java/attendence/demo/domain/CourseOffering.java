package attendence.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CourseOffering {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseOfferingId;

    @ManyToOne
    @JoinColumn(name = "courseId")
    private Course course;

    private LocalDate startDate;

    private LocalDate endDate;
    
    @ManyToOne
    @JoinColumn(name = "locationId")
    private Location location;

    @ManyToOne(cascade = CascadeType.ALL)
    private Faculty faculty;


    
    
}
