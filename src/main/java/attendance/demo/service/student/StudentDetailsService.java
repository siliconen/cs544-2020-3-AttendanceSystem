package attendance.demo.service.student;

import attendance.demo.appconfig.StudentDetails;
import attendance.demo.domain.Student;
import attendance.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class StudentDetailsService implements UserDetailsService {

    @Autowired
    private StudentRepository studentRepository;


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Student student = studentRepository.findByUserName(s);
        if (student==null)
            throw new UsernameNotFoundException("Student name not found");
        return new StudentDetails(student);
    }
}
