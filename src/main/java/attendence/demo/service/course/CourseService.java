package attendence.demo.service.course;

import java.util.List;

import attendence.demo.domain.Course;

public interface CourseService {

	List<Course> findAll();
	Course findById(int id);
	Course save(Course course);
	void delete(int id);

}