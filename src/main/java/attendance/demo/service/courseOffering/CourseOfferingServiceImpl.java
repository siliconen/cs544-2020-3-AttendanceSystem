package attendance.demo.service.courseOffering;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import attendance.demo.domain.Course;
import attendance.demo.domain.CourseOffering;
import attendance.demo.domain.Registry;
import attendance.demo.repository.AttendanceRepository;
import attendance.demo.repository.CourseOfferingRepository;
import attendance.demo.repository.RegistryRepository;
import attendance.demo.repository.SessionRepository;

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