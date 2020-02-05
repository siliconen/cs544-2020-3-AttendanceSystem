package attendance.demo.service.student;

import attendance.demo.domain.Student;
import attendance.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService{
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
}
