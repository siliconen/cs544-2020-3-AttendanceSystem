package attendance.demo.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;


@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CourseOffering {
    @Id
    @GeneratedValue
    private int courseOfferingId;


    @ManyToOne
    @JoinColumn(name = "courseId")
    private Course course;

    private LocalDate startDate;

    private LocalDate endDate;

    @ManyToOne
    @JoinColumn(name = "locationId")
    private Location location;

    @ManyToOne(cascade = CascadeType.ALL)
    private Faculty faculty;

    public int getCourseOfferingId()
    {
        System.out.println("domain");
        return courseOfferingId;
    }

    public Course getCourse() {
        return course;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public Location getLocation() {
        return location;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setCourseOfferingId(int courseOfferingId) {
        this.courseOfferingId = courseOfferingId;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
}
