package attendence.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Course {
<<<<<<< HEAD
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String courseId;
=======
	@Id
	@GeneratedValue
	private int id;
>>>>>>> 770ad13497deff0422f66199f050fe3c10a0620b

	@NotBlank
	private String courseId;
	@NotBlank
	private String name;

	private String description;

}
