<<<<<<< HEAD:src/main/java/attendence/demo/repository/AttendanceRepository.java
package attendence.demo.repository;

=======
package attendance.demo.repository;
>>>>>>> 1eda4df70839c95503568c435d03eb1e046f6342:src/main/java/attendance/demo/repository/AttendanceRepository.java

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD:src/main/java/attendence/demo/repository/AttendanceRepository.java

=======
>>>>>>> 1eda4df70839c95503568c435d03eb1e046f6342:src/main/java/attendance/demo/repository/AttendanceRepository.java
import org.springframework.stereotype.Repository;

import attendance.demo.domain.AttendanceRecord;

@Repository
@org.springframework.transaction.annotation.Transactional
public interface AttendanceRepository extends JpaRepository<AttendanceRecord, Integer> {

	@Query("select a from Session s, AttendanceRecord a "
			+ "where s.timeslot.id = a.timeslot.id "
			+ "and s.date = a.date "
			+ "and s.id=:sessionId")
	List<AttendanceRecord> getSessionRecords(@Param("sessionId") int sessionId);
	
	@Query("select a from AttendanceRecord a, Session s, CourseOffering c "
			+ "where s.date = a.date "
			+ "and s.timeslot.id = a.timeslot.id "
			+ "and c.courseOfferingId = s.courseOffering.courseOfferingId "
			+ "and c.location.id = a.location.id "
			+ "and a.student.studentId=:studentId "			
			+ "and s.courseOffering.courseOfferingId=:courseOfferingId "
			+ "order by a.date, s.timeslot.id")
	List<AttendanceRecord> getStudentRecordsInCourseOffering(@Param("studentId") String studentId, @Param("courseOfferingId") int courseOfferingId);	
	
}