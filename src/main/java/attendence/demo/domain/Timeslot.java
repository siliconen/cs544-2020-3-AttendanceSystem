package attendence.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Timeslot {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String abbreviation;

	private String description;

	private LocalTime beginTime;

	private LocalTime endTime;


}
