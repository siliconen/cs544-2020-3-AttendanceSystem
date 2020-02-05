package attendence.demo.domain;

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
	@Id
	@GeneratedValue
	private long id;
	
	@NotBlank
	private String firstName;

	@NotBlank
	private String lastName;

	@NotBlank
	private String password;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "faculty")
	private List<CourseOffering> courseOfferings;
}
