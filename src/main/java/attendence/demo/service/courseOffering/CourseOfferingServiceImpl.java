package attendence.demo.service.courseOffering;

import attendence.demo.domain.Course;
import attendence.demo.domain.CourseOffering;
import attendence.demo.repository.CourseOfferingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseOfferingServiceImpl implements CourseOfferingService {

	@Autowired
	private CourseOfferingRepository courseOfferingRepository;
	
	@Override
	public List<CourseOffering> getCourseOffering() {

		return courseOfferingRepository.findAll();
	}

}