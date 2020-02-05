package attendence.demo.service.courseOffering;

import attendence.demo.domain.Course;
import attendence.demo.domain.CourseOffering;
import attendence.demo.domain.Registry;
import attendence.demo.repository.AttendanceRepository;
import attendence.demo.repository.CourseOfferingRepository;
import attendence.demo.repository.RegistryRepository;
import attendence.demo.repository.SessionRepository;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseOfferingServiceImpl implements CourseOfferingService {

	@Autowired
	private CourseOfferingRepository courseOfferingRepository;

	@Autowired
	private SessionRepository sessionRepository;

	@Autowired
	private RegistryRepository registryRepository;

	@Autowired
	private AttendanceRepository attendanceRepository;

	@Override
	public List<CourseOffering> getCourseOffering() {

		return courseOfferingRepository.findAll();
	}

	@Override
	public double countAttendacePercentInCourseOffering(int courseOfferingId) {
		int sessionCount = sessionRepository.countByCourseOffering(courseOfferingId);
		int registrationCount = registryRepository.countByCourseOffering(courseOfferingId);
		int attendanceCount = attendanceRepository.countRecordsInCourseOffering(courseOfferingId);

		return ((attendanceCount * 1.0) / (sessionCount * registrationCount)) * 100;
	}

}