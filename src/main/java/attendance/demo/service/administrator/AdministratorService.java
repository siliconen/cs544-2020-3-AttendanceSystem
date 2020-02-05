package attendance.demo.service.administrator;


import attendance.demo.domain.Administrator;

import java.util.List;

public interface AdministratorService {
    List<Administrator> findAll();
    Administrator findById(int id);
    Administrator save(Administrator administrator);
    void delete(int id);
}
