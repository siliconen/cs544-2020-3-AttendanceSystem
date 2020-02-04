package attendence.demo.service.course;

import java.util.List;

import attendence.demo.domain.Course;
import attendence.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public List<Course> getCourse() {
		return courseRepository.findAll();
	}

}