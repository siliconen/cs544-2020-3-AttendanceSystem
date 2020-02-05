package attendence.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import attendence.demo.domain.Student;
import attendence.demo.service.student.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping(value = "/faculty/students/session/{sessionid}")
	public List<Student> getStudentListBySession(@PathVariable("sessionid") int sessionId) {
		return studentService.getStudentListBySession(sessionId);
	}
}
