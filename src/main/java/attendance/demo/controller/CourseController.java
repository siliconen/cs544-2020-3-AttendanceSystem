package attendance.demo.controller;

import attendance.demo.domain.Course;
import attendance.demo.service.course.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Optional getCourse(@PathVariable Integer id){
        return courseService.findById(id);
    }
    @PostMapping("/admin/courses")
    public Course saveCourse(@RequestBody Course course){
        return courseService.save(course);
    }
    @PutMapping("/admin/courses")
    public Course updateCourse(@RequestBody Course course){
        return courseService.save(course);
    }
    @DeleteMapping(value ="/admin/courses/{id}")
    public void deleteCourse(@PathVariable Integer id){
         courseService.delete(id);
    }
    @GetMapping(value ="faculty/courses")
    public List<Course> getCourses() {
        return courseService.findAll();
    }
<<<<<<< HEAD:src/main/java/attendence/demo/controller/CourseController.java
=======
	@Autowired
	private CourseService courseService;

	@GetMapping("admin/read_courses")
	public List<Course> getAllCourses() {
		return courseService.findAll();
	}

	@GetMapping("/admin/courses/{id}")
	public Course getCourse(@PathVariable Integer id) {
		return courseService.findById(id);
	}

	@PostMapping("/admin/courses")
	public Course saveCourse(Course course) {
		return courseService.save(course);
	}

	@PutMapping("/admin/courses")
	public Course updateCourse(Course course) {
		return courseService.save(course);
	}

	@DeleteMapping(value = "/admin/courses/{id}")
	public void deleteCourse(@PathVariable Integer id) {
		courseService.delete(id);
	}
>>>>>>> 770ad13497deff0422f66199f050fe3c10a0620b
=======
>>>>>>> 1eda4df70839c95503568c435d03eb1e046f6342:src/main/java/attendance/demo/controller/CourseController.java

}
