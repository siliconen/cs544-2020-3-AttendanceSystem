package attendance.demo.controller;

import attendance.demo.domain.Administrator;
import attendance.demo.service.administrator.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdministratorController {

    @Autowired
    private AdministratorService administratorService;

    @GetMapping("admin/read_administrators")
    public List<Administrator> getAllAdministrators() {
        return administratorService.findAll();
    }

    @GetMapping("/admin/administrators/{id}")
    public Administrator getAdministrator(@PathVariable Integer id){
        return administratorService.findById(id);
    }
    @PostMapping("/admin/Administrators")
    public Administrator saveAdministrator(Administrator administrator){
        return administratorService.save(administrator);
    }
    @PutMapping("/admin/Administrators")
    public Administrator updateAdministrator(Administrator administrator){
        return administratorService.save(administrator);
    }
    @DeleteMapping(value ="/admin/Administrators/{id}")
    public void deleteAdministrator(@PathVariable Integer id){
        administratorService.delete(id);
    }
}
