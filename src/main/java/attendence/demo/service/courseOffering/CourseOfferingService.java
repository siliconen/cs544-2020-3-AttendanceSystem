package attendence.demo.service.courseOffering;

import attendence.demo.domain.CourseOffering;

import java.util.List;

public interface CourseOfferingService {

	public CourseOffering updateCourseOffering(CourseOffering courseOffering);

	public boolean deleteCourseOfferingById(int id);

	public CourseOffering getCourseOfferingById(int id);

	public List<CourseOffering> getAllCourseOfferings();


	public CourseOffering addCourseOffering(CourseOffering courseOffering);



}