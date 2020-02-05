package attendance.demo.controller;


import attendance.demo.domain.Course;
import attendance.demo.domain.Faculty;
import attendance.demo.service.course.CourseService;
import attendance.demo.service.faculty.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FacultyController{

    @Autowired
    private FacultyService facultyService;

    @GetMapping("admin/faculty_users")
    public List<Faculty> getAllCourses() {
        return facultyService.findAll();
    }

    @GetMapping("/admin/faculty_users/{id}")
    public Optional getCourse(@PathVariable Integer id){
        return facultyService.findById(id);
    }
    @PostMapping("/admin/faculty_users")
    public Faculty saveCourse(@RequestBody Faculty faculty){
        return facultyService.save(faculty);
    }
    @PutMapping("/admin/faculty_users")
    public Faculty updateCourse(@RequestBody Faculty faculty){
        return facultyService.save(faculty);
    }
    @DeleteMapping(value ="/admin/faculty_users/{id}")
    public void deleteCourse(@PathVariable Integer id){
        facultyService.delete(id);
    }

}
