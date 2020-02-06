package attendance.demo.service.administrator;

import attendance.demo.domain.Administrator;
import attendance.demo.repository.AdministratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AdministratorServiceImpl implements AdministratorService{

    @Autowired
    private AdministratorRepository administratorRepository;

    @Override
    public List<Administrator> findAll() {
        return administratorRepository.findAll();
    }

    @Override
    public Optional<Administrator> findById(int id) {
        return administratorRepository.findById(id);
    }

    @Override
    public Administrator save(Administrator administrator) {
        return administratorRepository.save(administrator);
    }

    @Override
    public void delete(int id) {
        administratorRepository.deleteById(id);
    }

    @Override
    public void delete2() {
        administratorRepository.deleteAll();
    }
}
