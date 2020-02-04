package attendence.demo.controller;

import attendence.demo.domain.Course;
import attendence.demo.service.course.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdminController {

    @Autowired
    private CourseService courseService;

    @GetMapping("admin/read_courses")
    public List<Course> getAllCourses() {
        return courseService.findAll();
    }

    @GetMapping("/admin/read_course/{id}")
    public Course getCourse(@PathVariable Integer id){
        return courseService.findById(id);
    }
    @GetMapping("/admin/add_Course")
    public Course saveCourse(Course course){
        return courseService.save(course);
    }
    @GetMapping("/admin/update_Course")
    public Course updateCourse(Course course){
        return courseService.save(course);
    }
    @GetMapping("/admin/add_Course/{id}")
    public void deleteCourse(@PathVariable Integer id){
         courseService.delete(id);
    }

}
