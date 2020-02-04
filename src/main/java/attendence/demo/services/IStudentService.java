package attendence.demo.services;

import attendence.demo.domain.AttendanceRecord;
import attendence.demo.domain.Student;

import java.util.List;
import java.util.Optional;

public interface IStudentService {
    Student addStudent(Student student);
    Optional<Student> findStudentById(Long id);
    List<AttendanceRecord> getAllAttendanceRecords(Long id);
}
