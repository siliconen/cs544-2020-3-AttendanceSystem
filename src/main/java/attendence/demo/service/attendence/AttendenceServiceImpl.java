package attendence.demo.service.attendence;

import java.lang.module.FindException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import attendence.demo.domain.AttendanceRecord;
import attendence.demo.repository.AttendanceRepository;
import attendence.demo.repository.StudentRepository;

@Service
@Transactional
public class AttendenceServiceImpl implements AttendenceService {

	@Autowired
	private AttendanceRepository attendanceRepository;

	@Override
	public List<AttendanceRecord> getStudentRecords(String studentId) {
		List<AttendanceRecord> list = attendanceRepository.getStudentRecords(studentId);
		return list;
	}

	@Override
	public List<AttendanceRecord> getSessiontRecords(int sessionId) {
		return attendanceRepository.getSessionRecords(sessionId);
	}

	@Override
	public List<AttendanceRecord> getStudentRecordsInCourseOffering(String studentId, int courseOfferingId) {
		// TODO Auto-generated method stub
		return attendanceRepository.getStudentRecordsInCourseOffering(studentId, courseOfferingId);
	}

}
