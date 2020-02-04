package attendence.demo.service.administrator;

import attendence.demo.domain.Administrator;

import attendence.demo.repository.AdministratorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministratorServiceImpl implements AdministratorService{

    @Autowired
    private AdministratorRepository administratorRepository;

    @Override
    public List<Administrator> findAll() {
        return administratorRepository.findAll();
    }

    @Override
    public Administrator findById(int id) {
        return administratorRepository.getOne(id);
    }

    @Override
    public Administrator save(Administrator administrator) {
        return administratorRepository.save(administrator);
    }

    @Override
    public void delete(int id) {
        administratorRepository.deleteById(id);
    }
    
}
