package attendence.demo.service.student;

import attendence.demo.domain.Student;
import attendence.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService  {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Student addStudent(Student student) {
        String hashedPassword = passwordEncoder.encode(student.getPassword());
        Student student1 = student;
        student1.setPassword(hashedPassword);
        return studentRepository.save(student1);
    }


}
