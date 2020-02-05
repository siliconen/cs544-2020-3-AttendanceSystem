package attendance.demo.service.student;

import java.util.List;

import attendance.demo.domain.Student;

public interface StudentService {
	List<Student> getStudentListBySession(int sessionId);
	
	List<Student> getStudentListByCourseOffering(int courseOfferingId);
	
	List<Student> getStudentListByCourse(String courseId);
}
