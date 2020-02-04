package attendence.demo.service.course;

import java.util.List;
import java.util.Optional;

import attendence.demo.domain.Course;
import attendence.demo.repository.CourseRepository;
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
	public Optional findById(int id) {
		return courseRepository.findById(id);
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