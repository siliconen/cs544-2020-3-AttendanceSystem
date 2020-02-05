package attendance.demo.service.courseOffering;

import java.util.List;

import attendance.demo.domain.CourseOffering;

public interface CourseOfferingService {

	List<CourseOffering> getCourseOffering();
	
	double countAttendacePercentInCourseOffering(int courseOfferingId);
}