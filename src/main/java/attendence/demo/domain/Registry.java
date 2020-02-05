package attendence.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

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
	@Valid
	@NotNull
	private CourseOffering courseOffering;

	@ManyToOne(cascade = CascadeType.ALL)
	@Valid
	@NotNull
	private Student student;
}
