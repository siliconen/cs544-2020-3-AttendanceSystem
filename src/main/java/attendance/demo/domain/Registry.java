package attendance.demo.domain;

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
<<<<<<< HEAD
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
=======
	@Id
	@GeneratedValue
	private long id;
>>>>>>> 770ad13497deff0422f66199f050fe3c10a0620b

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
