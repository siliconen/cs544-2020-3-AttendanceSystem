package attendence.demo.service.student;

import java.util.List;

import attendence.demo.domain.Student;

public interface StudentService {
	List<Student> getStudentListBySession(int sessionId);
	
	List<Student> getStudentListByCourseOffering(int courseOfferingId);
}
