package attendance.demo.service.courseOffering;

import attendance.demo.domain.CourseOffering;

import java.util.List;
import java.util.Optional;

public interface CourseOfferingService {

	List<CourseOffering> findAll();
	Optional findById(int id);
	CourseOffering save(CourseOffering courseOffering);
	void delete(int id);
	List<CourseOffering> findByFacultyId(int Id);
}