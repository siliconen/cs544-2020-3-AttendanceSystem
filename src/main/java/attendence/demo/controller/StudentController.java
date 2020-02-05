package attendence.demo.controller;

import attendence.demo.domain.Student;
import attendence.demo.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/hello")
    public String test(){
        return "hello from attendance";
    }

    @PostMapping(value = "/add")
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
}
