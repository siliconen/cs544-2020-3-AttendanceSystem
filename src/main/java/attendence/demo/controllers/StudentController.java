package attendence.demo.controllers;

import attendence.demo.domain.AttendanceRecord;
import attendence.demo.domain.Student;
import attendence.demo.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.PermitAll;
import java.util.List;

@RestController
@RequestMapping(value = "students")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @RequestMapping(value = "/")
    public String helloAttendance(){
        return "hello from attendance";
    }


    @PostMapping(value = "/addStudent",consumes = MediaType.APPLICATION_JSON_VALUE)
    public Student addStudent(@RequestBody   Student student){
        System.err.println("adding student");
        return studentService.addStudent(student);
    }

    @GetMapping(value = "/viewAttendance/{id}")
    public List<AttendanceRecord> getAllAttendanceRecords(@PathVariable Long id){
        return studentService.getAllAttendanceRecords(id);
    }
}
