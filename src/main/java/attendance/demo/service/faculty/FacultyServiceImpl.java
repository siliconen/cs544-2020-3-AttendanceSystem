package attendance.demo.service.faculty;

import attendance.demo.domain.CourseOffering;
import attendance.demo.domain.Faculty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacultyServiceImpl implements FacultyService {

    @Autowired
    private FacultyService facultyService;

    @Override
    public List<Faculty> findAll() {
        return facultyService.findAll();
    }

    @Override
    public Optional findById(int id) {
        return facultyService.findById(id);
    }

    @Override
    public Faculty save(Faculty faculty) {
        return facultyService.save(faculty);
    }

    @Override
    public void delete(int id) {
        facultyService.delete(id);
    }

    @Override
    public List<CourseOffering> findByFacultyId(int Id) {
        return null;
    }
}
