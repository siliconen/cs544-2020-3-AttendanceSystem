package attendance.demo.repository;

<<<<<<< HEAD:src/main/java/attendence/demo/repository/StudentRepository.java
import attendence.demo.domain.Student;
=======
import attendance.demo.domain.Student;
>>>>>>> 1eda4df70839c95503568c435d03eb1e046f6342:src/main/java/attendance/demo/repository/StudentRepository.java
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

import javax.transaction.Transactional;

@Repository
@Transactional()
public interface StudentRepository extends JpaRepository<Student, Integer> {

	@Query("select distinct ss from Student ss,  Session s, AttendanceRecord a " 
			+ "where s.timeslot.id = a.timeslot.id "			
			+ "and s.date = a.date "
			+ "and ss.id = a.student.id "
			+ "and s.id=:sessionId")
	List<Student> getStudentListBySession(@Param("sessionId") int sessionId);
	
	@Query("select distinct ss from Student ss,  Session s, AttendanceRecord a " 
			+ "where s.timeslot.id = a.timeslot.id "			
			+ "and s.date = a.date "
			+ "and ss.id = a.student.id "
			+ "and s.courseOffering.courseOfferingId=:courseOfferingId")
	List<Student> getStudentListByCourseOffering(@Param("courseOfferingId") int courseOfferingId);
}