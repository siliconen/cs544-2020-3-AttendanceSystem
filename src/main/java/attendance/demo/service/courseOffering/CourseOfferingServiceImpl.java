package attendance.demo.service.courseOffering;

import attendance.demo.domain.CourseOffering;
import attendance.demo.repository.CourseOfferingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CourseOfferingServiceImpl implements CourseOfferingService {

	@Autowired
	private CourseOfferingRepository courseOfferingRepository;


	@Override
	public List<CourseOffering> findAll() {
		System.out.println("Service");
		return courseOfferingRepository.findAll();
	}

	@Override
	public Optional findById(int id) {

		return courseOfferingRepository.findById(id);
	}

	@Override
	public CourseOffering save(CourseOffering courseOffering) {
		return courseOfferingRepository.saveAndFlush(courseOffering);
	}

	@Override
	public void delete(int id) {
		courseOfferingRepository.deleteById(id);
	}

	public List<CourseOffering> findByFacultyId(int facultyId) {
		List<CourseOffering>  theList = courseOfferingRepository.findAll();
		theList = theList.stream().filter(c-> c.getFaculty().getId() ==facultyId).collect(Collectors.toList());
		return theList;
	}
}