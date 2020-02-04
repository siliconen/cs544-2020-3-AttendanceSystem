package attendence.demo.repository;

import attendence.demo.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional()
public interface CourseRepository extends JpaRepository<Course, Integer> {
}