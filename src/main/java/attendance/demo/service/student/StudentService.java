package attendance.demo.service.student;
import attendance.demo.domain.Student;
import java.util.List;

public interface StudentService {

    List<Student> getStudentListBySession(int sessionId);

    List<Student> getStudentListByCourseOffering(int courseOfferingId);
}
