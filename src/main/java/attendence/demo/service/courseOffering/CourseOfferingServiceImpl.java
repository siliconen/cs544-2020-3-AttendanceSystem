package attendence.demo.service.courseOffering;

import attendence.demo.domain.CourseOffering;
import attendence.demo.repository.CourseOfferingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CourseOfferingServiceImpl implements CourseOfferingService {

	@Autowired
	private CourseOfferingRepository courseOfferingRepository;

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public CourseOffering addCourseOffering(CourseOffering courseOffering) {
		courseOfferingRepository.save(courseOffering);
		
		return courseOffering;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public CourseOffering updateCourseOffering(CourseOffering courseOffering) {
		courseOfferingRepository.save(courseOffering);
		return courseOffering;
	}
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public boolean deleteCourseOfferingById(int id) {
		courseOfferingRepository.deleteById(id);
		return true;
	}
	@Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = true)
	public CourseOffering getCourseOfferingById(int id) {
		Optional<CourseOffering> opt= courseOfferingRepository.findById(id);
		return opt.get();
	}
	@Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = true)
	public List<CourseOffering> getAllCourseOfferings() {
		
		return courseOfferingRepository.findAll();
	}

}