package attendance.demo.controller;
import java.util.List;
import attendance.demo.domain.AttendanceRecord;
import attendance.demo.domain.Course;
import attendance.demo.domain.CourseOffering;
import attendance.demo.service.course.CourseService;
import attendance.demo.service.attendance.AttendanceService;
import attendance.demo.service.courseOffering.CourseOfferingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AttendanceRecordController {

    @Autowired
    private CourseService courseService;
    @Autowired
    private CourseOfferingService courseOfferingService;

    @Autowired
    private AttendanceService attendanceService;

    @GetMapping(value = "faculty/course")
    public List<Course> getCourses() {
        return courseService.findAll();
    }

    @GetMapping(value = "faculty/courseoffering")
    public List<CourseOffering> getCourseOffering() {
        //return courseOfferingService.getCourseOffering();
        return null;
    }

    @GetMapping(value = "/faculty/attendance/student/{studentid}/courseoffering/{offeringid}")
    public List<AttendanceRecord> getStudentRecordsInCourseOffering(@PathVariable("studentid") String studentId,
                                                                    @PathVariable("offeringid") int courseOfferingId) {
        List<AttendanceRecord> result = attendanceService.getStudentRecordsInCourseOffering(studentId,
                courseOfferingId);
        return result;
    }

    @GetMapping(value = "/faculty/attendance/session/{sessionid}")
    public List<AttendanceRecord> getSessionRecords(@PathVariable("sessionid") int sessionId) {
        List<AttendanceRecord> result = attendanceService.getSessionRecords(sessionId);
        return result;
    }
}