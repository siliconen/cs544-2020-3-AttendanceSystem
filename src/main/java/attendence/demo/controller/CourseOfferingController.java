package attendence.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import attendence.demo.service.courseOffering.CourseOfferingService;

@RestController
public class CourseOfferingController {
	@Autowired
	private CourseOfferingService courseOfferingService;

	@GetMapping(value = "/faculty/attendancepercent/courseoffering/{courseofferingid}")
	public double calculateCourseOfferingPecent(@PathVariable("courseofferingid") int courseOfferingId) {
		return courseOfferingService.countAttendacePercentInCourseOffering(courseOfferingId);
	}
}
