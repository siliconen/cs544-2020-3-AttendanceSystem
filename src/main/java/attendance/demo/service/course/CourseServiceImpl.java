package attendance.demo.service.course;

import java.util.List;
import java.util.Optional;

import attendance.demo.repository.CourseRepository;
import attendance.demo.domain.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {


	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public List<Course> findAll() {
		return courseRepository.findAll();
	}

	@Override
<<<<<<< HEAD:src/main/java/attendence/demo/service/course/CourseServiceImpl.java
	public Course findById(int id) {
		Optional<Course> c=courseRepository.findById(id);
		return c.get();
=======
	public Optional findById(int id) {
		return courseRepository.findById(id);
>>>>>>> 1eda4df70839c95503568c435d03eb1e046f6342:src/main/java/attendance/demo/service/course/CourseServiceImpl.java
	}

	@Override
	public Course save(Course course) {
		return courseRepository.save(course);
	}

	@Override
	public void delete(int id) {
		 courseRepository.deleteById(id);
	}

}