package attendance.demo.controller;

import attendance.demo.domain.Course;
import attendance.demo.service.course.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

<<<<<<< HEAD
	@Autowired
	private CourseService courseService;

	@GetMapping("admin/courses")
	public List<Course> getAllCourses() {
		return courseService.findAll();
	}

	@GetMapping("/admin/courses/{id}")
	public Optional getCourse(@PathVariable Integer id) {
		return courseService.findById(id);
	}

	@PostMapping("/admin/courses")
	public Course saveCourse(@RequestBody Course course) {
		return courseService.save(course);
	}

	@PutMapping("/admin/courses")
	public Course updateCourse(@RequestBody Course course) {
		return courseService.save(course);
	}

	@DeleteMapping(value = "/admin/courses/{id}")
	public void deleteCourse(@PathVariable Integer id) {
		courseService.delete(id);
	}

	@GetMapping(value = "faculty/courses")
	public List<Course> getCourses() {
		return courseService.findAll();
	}
=======
    @Autowired
    private CourseService courseService;

    @PreAuthorize("hasAnyAuthority('ADMIN','ROLE_FACULTY')")
    @GetMapping("admin/courses")
    public List<Course> getAllCourses() {
        return courseService.findAll();
    }
    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/admin/courses/{id}")
    public Optional getCourse(@PathVariable Integer id){
        return courseService.findById(id);
    }
    @PreAuthorize("hasAuthority('ADMIN')")
    @PostMapping("/admin/courses")
    public Course saveCourse(@RequestBody Course course){
        return courseService.save(course);
    }
    @PreAuthorize("hasAuthority('ADMIN')")
    @PutMapping("/admin/courses")
    public Course updateCourse(@RequestBody Course course){
        return courseService.save(course);
    }
    @PreAuthorize("hasAuthority('ADMIN')")
    @DeleteMapping(value ="/admin/courses/{id}")
    public void deleteCourse(@PathVariable Integer id){
         courseService.delete(id);
    }


>>>>>>> c31e3a9f3658204b7e76956a85a5816d55d843ff

}
