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
public class AttendanceRecord {
<<<<<<< HEAD
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "studentId")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "timeslotId")
    private Timeslot timeslot;

    @ManyToOne
    @JoinColumn(name = "locationId")
    private Location location;

    private LocalDate date;

=======
	@Id
	@GeneratedValue
	private int id;

	@ManyToOne
	@JoinColumn(name = "studentId")
	@Valid
	@NotNull
	private Student student;

	@ManyToOne
	@JoinColumn(name = "timeslotId")
	@Valid
	@NotNull
	private Timeslot timeslot;

	@ManyToOne
	@JoinColumn(name = "locationId")
	@Valid
	@NotNull
	private Location location;

	@NotNull
	private LocalDate date;
>>>>>>> 770ad13497deff0422f66199f050fe3c10a0620b

}
