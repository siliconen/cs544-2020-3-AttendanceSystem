package attendance.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import attendance.demo.domain.AttendanceRecord;
import attendance.demo.domain.CourseOffering;

import javax.transaction.Transactional;

@Repository
@Transactional()
public interface CourseOfferingRepository extends JpaRepository<CourseOffering, Integer> {
}