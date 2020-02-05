package attendence.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import attendence.demo.domain.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty, Integer> {
}
