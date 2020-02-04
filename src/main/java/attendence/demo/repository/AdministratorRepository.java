package attendence.demo.repository;

import attendence.demo.domain.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional()
public interface AdministratorRepository extends JpaRepository<Administrator, Integer> {
}
