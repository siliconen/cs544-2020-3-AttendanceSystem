package attendance.demo.repository;
import attendance.demo.domain.Student;
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