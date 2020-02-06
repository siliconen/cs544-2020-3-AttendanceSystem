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
	@Id
	@GeneratedValue
	private int courseOfferingId;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "courseId")
	@Valid
	@NotNull
	private Course course;

	@NotNull
	private LocalDate startDate;
	@NotNull
	private LocalDate endDate;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "locationId")
	@Valid
	@NotNull
	private Location location;

	@ManyToOne(cascade = CascadeType.ALL)
	@Valid
	private Faculty faculty;

}
