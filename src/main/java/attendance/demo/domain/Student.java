package attendance.demo.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
	@Id
	@GeneratedValue
	private Long id;
	
	private String studentId;
	
	private String firstName;
	
	private String lastName;

	private String username;

	private String password;
	
	private String barCode;

	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JsonManagedReference
	private List<AttendanceRecord> attendanceRecords;

}
