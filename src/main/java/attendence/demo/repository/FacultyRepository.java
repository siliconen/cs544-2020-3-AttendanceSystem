package attendence.demo.repository;

import attendence.demo.domain.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;

@Repository
@Transactional()
public interface FacultyRepository extends JpaRepository<Faculty, Integer> {
}
