package attendance.demo.service.courseOffering;
import attendance.demo.domain.CourseOffering;
import attendance.demo.repository.CourseOfferingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CourseOfferingServiceImpl implements CourseOfferingService {

	@Autowired
	private CourseOfferingRepository courseOfferingRepository;
	


	public CourseOffering addCourseOffering(CourseOffering courseOffering) {
		courseOfferingRepository.save(courseOffering);
		return courseOffering;
	}


	public CourseOffering updateCourseOffering(CourseOffering courseOffering) {
		courseOfferingRepository.save(courseOffering);
		return courseOffering;
	}

	public boolean deleteCourseOfferingById(int id) {
		courseOfferingRepository.deleteById(id);
		return true;
	}

	public CourseOffering getCourseOfferingById(int id) {
		Optional<CourseOffering> opt= courseOfferingRepository.findById(id);
		return opt.get();
	}

	public List<CourseOffering> getAllCourseOfferings() {
		return courseOfferingRepository.findAll();
	}

}