package attendance.demo.controller;

import attendence.demo.domain.Student;
import attendence.demo.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PreAuthorize("hasAuthority('USER')")
    @RequestMapping(value = "/hello")
    public String test(){
        return "hello from attendance";
    }

    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @PostMapping(value = "/add")
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
}
