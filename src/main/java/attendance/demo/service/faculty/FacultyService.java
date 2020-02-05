package attendance.demo.service.faculty;

import attendance.demo.domain.CourseOffering;
import attendance.demo.domain.Faculty;

import java.util.List;
import java.util.Optional;

public interface FacultyService {
    /*

    List<CourseOffering> findAll();
	Optional findById(int id);
	CourseOffering save(CourseOffering courseOffering);
	void delete(int id);
	List<CourseOffering> findByFacultyId(int Id);

     */

    List<Faculty> findAll();
    Optional findById(int id);
    Faculty save(Faculty faculty);
    void delete(int id);
    List<CourseOffering> findByFacultyId(int Id);
}
