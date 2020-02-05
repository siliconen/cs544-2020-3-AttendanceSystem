package attendence.demo.service.attendence;

import java.util.List;

import attendence.demo.domain.AttendanceRecord;

public interface AttendenceService{
	List<AttendanceRecord> getStudentRecords(String studentId);
	
	List<AttendanceRecord> getSessiontRecords(int sessionId);
	
	List<AttendanceRecord> getStudentRecordsInCourseOffering(String studentId, int courseOfferingId);
}
