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
public class Session {
<<<<<<< HEAD
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "courseOfferingId")
    private CourseOffering courseOffering;

    @ManyToOne
    @JoinColumn(name = "timeSlotId")
    private Timeslot timeslot;

    private LocalDate date;


=======
	@Id
	@GeneratedValue
	private int id;

	@ManyToOne
	@JoinColumn(name = "courseOfferingId")
	@Valid
	@NotNull
	private CourseOffering courseOffering;

	@ManyToOne
	@JoinColumn(name = "timeSlotId")
	@Valid
	@NotNull
	private Timeslot timeslot;

	@NotNull
	private LocalDate date;
>>>>>>> 770ad13497deff0422f66199f050fe3c10a0620b

}
