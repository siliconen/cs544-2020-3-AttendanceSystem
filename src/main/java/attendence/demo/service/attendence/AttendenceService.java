package attendence.demo.service.attendence;


import attendence.demo.domain.AttendanceRecord;

import java.util.List;

public interface AttendenceService {
    List<AttendanceRecord> findAll();
    AttendanceRecord findById(int id);
    AttendanceRecord save(AttendanceRecord attendanceRecord);
    void delete(int id);
}
