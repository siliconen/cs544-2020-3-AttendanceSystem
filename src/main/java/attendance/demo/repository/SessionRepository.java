package attendance.demo.repository;

<<<<<<< HEAD

=======
>>>>>>> c31e3a9f3658204b7e76956a85a5816d55d843ff
import attendance.demo.domain.CourseOffering;
import attendance.demo.domain.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
<<<<<<< HEAD


=======
>>>>>>> c31e3a9f3658204b7e76956a85a5816d55d843ff

@Repository
@Transactional
public interface SessionRepository extends JpaRepository<Session, Integer> {

	List<Session> findByCourseOffering(CourseOffering courseOffering);

	@Query("select count(*) from Session s where s.courseOffering.courseOfferingId=:courseOfferingId")
	int countByCourseOffering(@Param("courseOfferingId") int courseOfferingId);
}