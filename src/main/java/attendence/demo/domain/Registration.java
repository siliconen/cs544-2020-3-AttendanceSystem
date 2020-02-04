package attendence.demo.domain;

import javax.persistence.*;

@Entity
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double GPA;

    @ManyToOne
    private Student student;

    @ManyToOne
    private CourseOffering courseOffering;

    public double getGPA() {
        return GPA;
    }

    public Long getId() {
        return id;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public CourseOffering getCourseOffering() {
        return courseOffering;
    }

    public void setCourseOffering(CourseOffering courseOffering) {
        this.courseOffering = courseOffering;
    }
}
