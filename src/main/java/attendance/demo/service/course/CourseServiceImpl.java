package attendance.demo.service.course;

import attendance.demo.domain.Course;
import attendance.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public List<Course> findAll() {
		return courseRepository.findAll();
	}

	@Override
	public Course findById(int id) {
		return courseRepository.getOne(id);
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