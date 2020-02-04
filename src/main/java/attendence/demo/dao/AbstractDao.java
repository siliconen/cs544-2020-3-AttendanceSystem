package attendence.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class AbstractDao<T> implements JpaRepository<T, Long> {
}
