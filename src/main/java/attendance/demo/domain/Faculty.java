package attendance.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Faculty {
<<<<<<< HEAD
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firstName;
=======
	@Id
	@GeneratedValue
	private long id;
	
	@NotBlank
	private String firstName;
>>>>>>> 770ad13497deff0422f66199f050fe3c10a0620b

	@NotBlank
	private String lastName;

	@NotBlank
	private String password;

<<<<<<< HEAD:src/main/java/attendence/demo/domain/Faculty.java
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "faculty")
	private List<CourseOffering> courseOfferings;
=======

>>>>>>> 1eda4df70839c95503568c435d03eb1e046f6342:src/main/java/attendance/demo/domain/Faculty.java
}
