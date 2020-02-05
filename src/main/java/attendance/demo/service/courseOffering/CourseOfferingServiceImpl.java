package attendance.demo.service.courseOffering;

import attendance.demo.domain.CourseOffering;
import attendance.demo.repository.CourseOfferingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseOfferingServiceImpl implements CourseOfferingService {

	@Autowired
	private CourseOfferingRepository courseOfferingRepository;
	
	@Override
	public List<CourseOffering> findAll() {

		return courseOfferingRepository.findAll();
	}

}