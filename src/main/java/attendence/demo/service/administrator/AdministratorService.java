package attendence.demo.service.administrator;

import attendence.demo.domain.Administrator;


import java.util.List;

public interface AdministratorService {
    List<Administrator> findAll();
    Administrator findById(int id);
    Administrator save(Administrator administrator);
    void delete(int id);
}
