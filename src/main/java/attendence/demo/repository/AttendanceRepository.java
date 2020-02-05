package attendence.demo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import attendence.demo.domain.AttendanceRecord;

@Repository
@org.springframework.transaction.annotation.Transactional
public interface AttendanceRepository extends JpaRepository<AttendanceRecord, Integer> {

	@Query("select a from AttendanceRecord a where a.student.studentId=:studentId")
	List<AttendanceRecord> getStudentRecords(@Param("studentId") String studentId);

	@Query("select a from Session s, AttendanceRecord a where s.timeslot.id = a.timeslot.id and s.id=:sessionId")
	List<AttendanceRecord> getSessionRecords(@Param("sessionId") int sessionId);
	
	@Query("select a from AttendanceRecord a, Session s "
			+ "where s.timeslot.id = a.timeslot.id "
			+ "and a.student.studentId=:studentId "
			+ "and s.courseOffering.courseOfferingId=:courseOfferingId")
	List<AttendanceRecord> getStudentRecordsInCourseOffering(@Param("studentId") String studentId, @Param("courseOfferingId") int courseOfferingId);
}