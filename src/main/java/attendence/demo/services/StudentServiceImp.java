package attendence.demo.services;

import attendence.demo.dao.StudentDao;
import attendence.demo.domain.AttendanceRecord;
import attendence.demo.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class StudentServiceImp implements IStudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public Student addStudent(Student student) {
        return studentDao.save(student);
    }

    @Override
    public Optional<Student> findStudentById(Long id) {
        return studentDao.findById(id);
    }

    @Override
    public List<AttendanceRecord> getAllAttendanceRecords(Long id) {
        return findStudentById(id).get().getAttendanceRecords();
    }

}
