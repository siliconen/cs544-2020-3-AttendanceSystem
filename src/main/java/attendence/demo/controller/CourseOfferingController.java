package attendence.demo.controller;

import attendence.demo.domain.CourseOffering;
import attendence.demo.service.courseOffering.CourseOfferingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class CourseOfferingController {

    @Autowired
    private CourseOfferingService courseOfferingService;
    @GetMapping(value ="faculty/courseoffering")
    public List<CourseOffering> getCourseOffering() {
        return courseOfferingService.findAll();
    }
}
