package attendance.demo.domain;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import java.time.LocalDate;


@Entity
public class AttendanceRecord {

	@Id
	@GeneratedValue
	private int id;

	@ManyToOne
	@JoinColumn(name = "studentId")
	@Valid
	@NotNull
	private Student student;

	@ManyToOne
	@JoinColumn(name = "timeslotId")
	@Valid
	@NotNull
	private Timeslot timeslot;

	@ManyToOne
	@JoinColumn(name = "locationId")
	@Valid
	@NotNull
	private Location location;

	@NotNull
	private LocalDate date;

    public AttendanceRecord() {
    }

    public AttendanceRecord(Student student, Timeslot timeslot, Location location, LocalDate date) {
        this.student = student;
        this.timeslot = timeslot;
        this.location = location;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Timeslot getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(Timeslot timeslot) {
        this.timeslot = timeslot;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
