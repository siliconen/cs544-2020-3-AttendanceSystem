package attendence.demo.service.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import attendence.demo.domain.Student;
import attendence.demo.repository.StudentRepository;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getStudentListBySession(int sessionId) {
		return studentRepository.getStudentListBySession(sessionId);
	}
}
