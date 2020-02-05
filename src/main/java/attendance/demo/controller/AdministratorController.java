package attendance.demo.controller;

import attendance.demo.domain.Administrator;
import attendance.demo.domain.Course;
import attendance.demo.service.administrator.AdministratorService;
import attendance.demo.service.course.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AdministratorController {

    @Autowired
    private AdministratorService administratorService;

    @GetMapping("admin/admin_users")
    public List<Administrator> getAllAdmins() {
        return administratorService.findAll();
    }

    @GetMapping("/admin/admin_users/{id}")
    public Optional getAdmin(@PathVariable Integer id){
        return administratorService.findById(id);
    }
    @PostMapping("/admin/admin_users")
    public Administrator saveAdmin(@RequestBody Administrator administrator){
        return administratorService.save(administrator);
    }
    @PutMapping("/admin/admin_users")
    public Administrator updateAdmin(@RequestBody Administrator administrator){
        return administratorService.save(administrator);
    }
    @DeleteMapping(value ="/admin/admin_users/{id}")
    public void deleteAdmin(@PathVariable Integer id){
        administratorService.delete(id);
    }
}
