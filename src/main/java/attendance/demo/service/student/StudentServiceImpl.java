package attendance.demo.service.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import attendance.demo.domain.Student;
import attendance.demo.repository.StudentRepository;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getStudentListBySession(int sessionId) {
		return studentRepository.getStudentListBySession(sessionId);
	}

	@Override
	public List<Student> getStudentListByCourseOffering(int courseOfferingId) {
		return studentRepository.getStudentListByCourseOffering(courseOfferingId);
	}

	@Override
	public List<Student> getStudentListByCourse(String courseId) {
		// TODO Auto-generated method stub
		return studentRepository.getStudentListByCourse(courseId);
	}
}
