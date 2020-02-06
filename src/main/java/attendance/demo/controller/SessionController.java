package attendance.demo.controller;


import attendance.demo.domain.Session;
import attendance.demo.service.session.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SessionController {

    @Autowired
    private SessionService sessionService;

    @GetMapping("admin/read_sessions")
    public List<Session> getAllSessions() {
        System.out.println("Controller");
        return sessionService.findAll();
    }

    @GetMapping("/admin/sessions/{id}")
    public Optional getSession(@PathVariable Integer id){
        return sessionService.findById(id);
    }

    @PostMapping("/admin/sessions")
    public Session saveSession(@RequestBody Session session){
        return sessionService.save(session);
    }
    @PutMapping("/admin/sessions")
    public Session updateCourse(@RequestBody Session session){
        return sessionService.save(session);
    }
    @DeleteMapping(value ="/admin/sessions/{id}")
    public void deleteCourse(@PathVariable Integer id){
        sessionService.delete(id);
    }
}
