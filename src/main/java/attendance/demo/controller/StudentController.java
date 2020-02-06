package attendance.demo.controller;

import attendance.demo.domain.Student;
import attendance.demo.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "students")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @PreAuthorize("hasAuthority('USER')")
    @GetMapping(value = "/hello")
    public String test(){
        return "hello from attendance";
    }

    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @PostMapping(value = "/add")
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
}
