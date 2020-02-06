package attendance.demo.repository;

import javax.transaction.Transactional;

import attendance.demo.domain.AttendanceRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
@Transactional()
public interface AttendanceRepository extends JpaRepository<AttendanceRecord, Integer> {
}