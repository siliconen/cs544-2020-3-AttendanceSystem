package attendence.demo.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Student {
	@Id
	@GeneratedValue
	private Long id;
	
	private String studentId;
	
	private String firstName;
	
	private String lastName;
	
	private String barCode;

	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JsonManagedReference
	private List<AttendanceRecord> attendanceRecords;

	public Student() {
	}

	public Student(String studentId, String firstName, String lastName, String barCode) {
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.barCode = barCode;
	}

	public List<AttendanceRecord> getAttendanceRecords() {
		return attendanceRecords;
	}


	public Long getId() {
		return id;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}
}
