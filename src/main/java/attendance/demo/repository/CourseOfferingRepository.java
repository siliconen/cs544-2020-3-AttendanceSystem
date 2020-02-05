<<<<<<< HEAD:src/main/java/attendence/demo/repository/CourseOfferingRepository.java
package attendence.demo.repository;
import attendence.demo.domain.CourseOffering;
=======
package attendance.demo.repository;

import attendance.demo.domain.CourseOffering;
>>>>>>> 1eda4df70839c95503568c435d03eb1e046f6342:src/main/java/attendance/demo/repository/CourseOfferingRepository.java
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface CourseOfferingRepository extends JpaRepository<CourseOffering, Integer> {
	
}