package attendance.demo.controller;

import attendance.demo.domain.Faculty;
import attendance.demo.service.faculty.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/faculties")
public class FacultyController{

    @Autowired
    private FacultyService facultyService;

    @PreAuthorize("hasAuthority('ROLE_FACULTY')")
    @GetMapping("/test")
    public String test(){
        return "hello from faculty";
    }

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
