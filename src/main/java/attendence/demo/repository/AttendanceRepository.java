package attendence.demo.repository;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import attendence.demo.domain.AttendanceRecord;

@Repository
@Transactional()
public interface AttendanceRepository extends JpaRepository<AttendanceRecord, Integer> {
}