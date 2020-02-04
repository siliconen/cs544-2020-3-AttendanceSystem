package attendence.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Session {
    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    @JoinColumn(name = "courseOfferingId")
    private CourseOffering courseOffering;

    @ManyToOne
    @JoinColumn(name = "timeSlotId")
    private Timeslot timeslot;

    private LocalDate date;



}
