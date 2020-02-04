package attendence.demo.service.courseOffering;

import java.util.List;

import attendence.demo.domain.CourseOffering;

public interface CourseOfferingService {

	List<CourseOffering> findAll();
	CourseOffering findById(int id);
	CourseOffering save(CourseOffering courseOffering);
	void delete(int id);
	//List<CourseOffering> findByFacultyId(int Id);
}