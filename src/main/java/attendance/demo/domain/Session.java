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

}
