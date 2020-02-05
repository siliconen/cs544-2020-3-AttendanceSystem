package attendance.demo.controller;

import attendance.demo.domain.CourseOffering;
import attendance.demo.service.courseOffering.CourseOfferingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseOfferingController {

    @Autowired
    private CourseOfferingService courseOfferingService;

    @GetMapping("admin/read_courseOfferings")
    public List<CourseOffering> getAllCourseOfferings() {
        System.out.println("Controller");
        return courseOfferingService.findAll();
    }

    @GetMapping("/admin/courseOfferings/{id}")
    public Optional getCourseOffering(@PathVariable Integer id){
        return courseOfferingService.findById(id);
    }

    @PostMapping("/admin/courseOfferings")
    public CourseOffering saveCourseOffering(@RequestBody CourseOffering courseOffering){
        return courseOfferingService.save(courseOffering);
    }
    @PutMapping("/admin/courseOfferings")
    public CourseOffering updateCourse(@RequestBody CourseOffering courseOffering){
        return courseOfferingService.save(courseOffering);
    }
    @DeleteMapping(value ="/admin/courseOfferings/{id}")
    public void deleteCourse(@PathVariable Integer id){
        courseOfferingService.delete(id);
    }

    @GetMapping(value ="faculty/courseoffering/{id}")
    public List<CourseOffering> getCourseOffering(@PathVariable int id) {
        return courseOfferingService.findByFacultyId(id);
    }
}
