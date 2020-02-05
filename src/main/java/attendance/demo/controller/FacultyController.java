package attendance.demo.controller;


import attendance.demo.domain.Faculty;
import attendance.demo.service.faculty.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FacultyController{

    @Autowired
    FacultyService facultyService;

    @GetMapping("faculty/read_faculties")
    public List<Faculty> getAllFaculties(){
        return facultyService.findAll();
    }
    @GetMapping("/faculty/faculties/{id}")
    public Optional getFaculty(int id){
        return facultyService.findById(id);
    }
    @PostMapping("/faculty/faculties")
    public Faculty saveFaculty(@RequestBody Faculty faculty){
        return facultyService.save(faculty);
    }
    @PutMapping("/faculty/faculties")
    public Faculty updateFaculty(@RequestBody Faculty faculty){
        return facultyService.save(faculty);
    }
    @DeleteMapping("/faculty/faculties/{id}")
    public void deleteFaculty(int id){
        facultyService.delete(id);
    }
    

}
