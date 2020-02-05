package attendence.demo.controller;

import attendence.demo.domain.Course;
import attendence.demo.service.course.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("admin/courses")
    public List<Course> getAllCourses() {
        return courseService.findAll();
    }

    @GetMapping("/admin/courses/{id}")
    public Course getCourse(@PathVariable Integer id){
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

}
