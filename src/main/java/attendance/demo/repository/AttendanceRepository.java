package attendance.demo.repository;

import attendance.demo.domain.AttendanceRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional()
public interface AttendanceRepository extends JpaRepository<AttendanceRecord, Integer> {
}