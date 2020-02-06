package attendance.demo.controller;
import attendance.demo.domain.CourseOffering;
import attendance.demo.service.courseOffering.CourseOfferingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import attendance.demo.service.courseOffering.CourseOfferingService;

import java.util.List;

@RestController
public class CourseOfferingController {
	@Autowired
	private CourseOfferingService courseOfferingService;



	@GetMapping(value="/courseOfferings",produces = MediaType.APPLICATION_JSON_VALUE)
	//@Secured({"ROLE_ADMIN","ROLE_FACULTY"})
	public List<CourseOffering> getAllCourseOfferings() {
		return courseOfferingService.getAllCourseOfferings();

	}

	@PostMapping(value="/courseOfferings")
	//@Secured({"ROLE_ADMIN"})
	public CourseOffering addCourseOffering(@RequestBody CourseOffering courseOffering, BindingResult result) {
		if(result.hasErrors()) {
			System.out.println("Error! Checkout your entries please ! ");
		}
		return courseOfferingService.addCourseOffering(courseOffering);
	}

	@GetMapping(value="/courseOfferings/{id}")
	//@Secured({"ROLE_ADMIN","ROLE_FACULTY")
	public CourseOffering getCourseOffering(@PathVariable Integer id) {
		return courseOfferingService.getCourseOfferingById(id);

	}

	@PutMapping(value="/courseOfferings")
	//@Secured({"ROLE_ADMIN"})
	public CourseOffering updateCourseOffering(@RequestBody CourseOffering courseOffering, BindingResult result) {
		if(result.hasErrors()) {
			System.out.println("Error! Checkout your entries please ! ");
		}

		return courseOfferingService.updateCourseOffering(courseOffering);

	}

	@DeleteMapping(value="/courseOfferings/{id}")
	//@Secured({"ROLE_ADMIN"})
	public boolean deleteCourseOffering(@PathVariable Integer id) {

		return courseOfferingService.deleteCourseOfferingById(id);
	}
	@GetMapping(value = "/faculty/attendancepercent/courseoffering/{courseofferingid}")
	public double calculateCourseOfferingPecent(@PathVariable("courseofferingid") int courseOfferingId) {
		return courseOfferingService.countAttendancePercentInCourseOffering(courseOfferingId);
	}
}
