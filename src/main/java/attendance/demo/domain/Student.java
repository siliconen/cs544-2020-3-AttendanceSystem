package attendance.demo.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student extends AbstractUser{
	
	private String studentId;
	
	private String firstName;
	
	private String lastName;

	private String barCode;

	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JsonManagedReference
	private List<AttendanceRecord> attendanceRecords;

	@Override
	public String getPassword() {
		return super.getPassword();
	}

	@Override
	public String getUsername() {
		return super.getUsername();
	}

	@Override
	public void setPassword(String password) {
		super.setPassword(password);
	}

	@Override
	public void setUsername(String username) {
		super.setUsername(username);
	}

	@Override
	public void setId(int id) {
		super.setId(id);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Student student = (Student) o;
		return Objects.equals(studentId, student.studentId) &&
				Objects.equals(firstName, student.firstName) &&
				Objects.equals(lastName, student.lastName) &&
				Objects.equals(barCode, student.barCode);
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentId, firstName, lastName, barCode);
	}
}
