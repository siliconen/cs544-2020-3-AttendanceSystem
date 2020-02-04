package attendence.demo.service.course;

import java.util.List;

import attendence.demo.domain.Course;
import org.springframework.stereotype.Service;

import attendence.demo.domain.AttendanceRecord;

public interface CourseService {

	List<Course> getCourse();
}