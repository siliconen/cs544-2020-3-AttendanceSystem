package attendance.demo.controller;

import attendance.demo.domain.Administrator;
import attendance.demo.domain.Course;
import attendance.demo.service.administrator.AdministratorService;
import attendance.demo.service.course.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AdministratorController {

<<<<<<< HEAD
	@Autowired
	private AdministratorService administratorService;

	@GetMapping("admin/admin_users")
	public List<Administrator> getAllAdmins() {
		return administratorService.findAll();
	}

	@GetMapping("/admin/admin_users/{id}")
	public Optional getAdmin(@PathVariable Integer id) {
		return administratorService.findById(id);
	}

	@PostMapping("/admin/admin_users")
	public Administrator saveAdmin(@RequestBody Administrator administrator) {
		return administratorService.save(administrator);
	}

	@PutMapping("/admin/admin_users")
	public Administrator updateAdmin(@RequestBody Administrator administrator) {
		return administratorService.save(administrator);
	}

	@DeleteMapping(value = "/admin/admin_users/{id}")
	public void deleteAdmin(@PathVariable Integer id) {
		administratorService.delete(id);
	}
=======
    @Autowired
    private AdministratorService administratorService;

    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("admin/admins")
    public List<Administrator> getAllAdmins() {
        return administratorService.findAll();
    }
    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/admin/admins/{id}")
    public Optional getAdmin(@PathVariable Integer id){
        return administratorService.findById(id);
    }
    @PreAuthorize("hasAuthority('ADMIN')")
    @PostMapping("/admin/admins")
    public Administrator addAdmin(@RequestBody Administrator administrator){
        return administratorService.save(administrator);
    }
    @PreAuthorize("hasAuthority('ADMIN')")
    @PutMapping("/admin/admins")
    public Administrator updateAdmin(@RequestBody Administrator administrator){
        return administratorService.save(administrator);
    }
    @PreAuthorize("hasAuthority('ADMIN')")
    @DeleteMapping(value ="/admin/admins/{id}")
    public void deleteAdmin(@PathVariable Integer id){
        administratorService.delete(id);
    }
>>>>>>> c31e3a9f3658204b7e76956a85a5816d55d843ff
}
