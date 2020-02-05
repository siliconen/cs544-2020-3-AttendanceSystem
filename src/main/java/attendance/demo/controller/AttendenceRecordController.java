package attendance.demo.controller;

import attendance.demo.domain.Course;
import attendance.demo.domain.CourseOffering;
import attendance.demo.service.course.CourseService;
import attendance.demo.service.courseOffering.CourseOfferingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AttendenceRecordController {

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
		return courseOfferingService.findAll();
	}
}