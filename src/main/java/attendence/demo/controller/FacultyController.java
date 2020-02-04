package attendence.demo.controller;

import java.util.List;

import attendence.demo.domain.Course;
import attendence.demo.domain.CourseOffering;
import attendence.demo.service.course.CourseService;
import attendence.demo.service.courseOffering.CourseOfferingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FacultyController {

	@Autowired
	private CourseService courseService;
	@Autowired
	private CourseOfferingService courseOfferingService;

	@GetMapping(value ="faculty/course")
	public List<Course> getCourses() {
		return courseService.findAll();
	}

	@GetMapping(value ="faculty/courseoffering")
	public List<CourseOffering> getCourseOffering() {
		return courseOfferingService.getCourseOffering();
	}
}