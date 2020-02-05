package attendance.demo.controller;
import attendance.demo.domain.CourseOffering;
import attendance.demo.service.courseOffering.CourseOfferingService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import attendance.demo.service.courseOffering.CourseOfferingService;

@RestController
public class CourseOfferingController {
	@Autowired
	private CourseOfferingService courseOfferingService;


	@RequestMapping(value="/courseOfferings", method=RequestMethod.GET)
	public List<CourseOffering> getAllCourseOfferings() {
		System.out.println("----getAllCourseOfferings()------");
		return courseOfferingService.getAllCourseOfferings();

	}

	@RequestMapping(value="/courseOfferings", method=RequestMethod.POST)
	 public CourseOffering addCourseOffering(@RequestBody CourseOffering courseOffering) {
		System.out.println("----addCourseOffering()------");
		return courseOfferingService.addCourseOffering(courseOffering);
	}

	@RequestMapping(value="/courseOfferings/{id}", method=RequestMethod.GET)
	public CourseOffering getCourseOffering(@PathVariable int id) {
		System.out.println("----getCourseOffering()------");
		return courseOfferingService.getCourseOfferingById(id);

	}

	@RequestMapping(value="/courseOfferings/{id}", method=RequestMethod.POST)
	public CourseOffering updateCourseOffering(@PathVariable int id) {

		System.out.println("----updateCourseOffering()------");
		CourseOffering courseOffering=courseOfferingService.getCourseOfferingById(id);

		return courseOfferingService.updateCourseOffering(courseOffering);

	}

	@RequestMapping(value="/deleteCourseOfferings/{id}", method=RequestMethod.POST)
	public boolean deleteCourseOffering(@PathVariable int id) {
		System.out.println("----deleteCourseOffering()------");
		return  courseOfferingService.deleteCourseOfferingById(id);

	}
	@GetMapping(value = "/faculty/attendancepercent/courseoffering/{courseofferingid}")
	public double calculateCourseOfferingPecent(@PathVariable("courseofferingid") int courseOfferingId) {
		return courseOfferingService.countAttendacePercentInCourseOffering(courseOfferingId);
	}
}
