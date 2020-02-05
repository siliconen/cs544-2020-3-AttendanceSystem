package attendance.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CourseOffering {
<<<<<<< HEAD
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

=======
	@Id
	@GeneratedValue
	private int courseOfferingId;

	@ManyToOne
	@JoinColumn(name = "courseId")
	@Valid
	@NotNull
	private Course course;

	@NotNull
	private LocalDate startDate;
	@NotNull
	private LocalDate endDate;

	@ManyToOne
	@JoinColumn(name = "locationId")
	@Valid
	@NotNull
	private Location location;

	@ManyToOne(cascade = CascadeType.ALL)
	@Valid
	private Faculty faculty;
>>>>>>> 770ad13497deff0422f66199f050fe3c10a0620b

}
