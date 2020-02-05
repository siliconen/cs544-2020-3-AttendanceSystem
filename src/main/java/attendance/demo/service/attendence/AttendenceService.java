package attendance.demo.service.attendence;


import attendance.demo.domain.AttendanceRecord;

import java.util.List;

public interface AttendenceService {
    List<AttendanceRecord> findAll();
    AttendanceRecord findById(int id);
    AttendanceRecord save(AttendanceRecord attendanceRecord);
    void delete(int id);
}
