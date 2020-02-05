package attendance.demo.service.attendence;

import java.util.List;

import attendance.demo.domain.AttendanceRecord;

public interface AttendenceService{
	
	List<AttendanceRecord> getSessionRecords(int sessionId);
	
	List<AttendanceRecord> getStudentRecordsInCourseOffering(String studentId, int courseOfferingId);
}
