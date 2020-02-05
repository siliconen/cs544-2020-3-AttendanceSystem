package attendence.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import attendence.demo.domain.Administrator;


public interface AdministratorRepository extends JpaRepository<Administrator, Integer>{
}
