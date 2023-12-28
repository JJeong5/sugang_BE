package com.example.modoosugang_be.Controller;

import com.example.modoosugang_be.Domain.Manager;
import com.example.modoosugang_be.Domain.Student;
import com.example.modoosugang_be.Repository.ManagerRepository;
import com.example.modoosugang_be.Service.ManagerService;
import com.example.modoosugang_be.Service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
public class LoginController {

    private final ManagerService managerService;
    private final StudentService studentService;

    @PostMapping("/login")
    public boolean login(@RequestBody Map<String, Object> param) {
        System.out.println((param));

        String univ = param.get("univ").toString();
        String id = param.get("id").toString();
        String pw = param.get("password").toString();
        boolean isManager = (boolean) param.get("isManager");

        if (isManager) {     // If Manager checkbox is checked
            Manager manager = managerService.findManager(id, univ);

            if (manager == null) {
                return false;   // No manager data in DB
            } else {
                // Manager's DB password == Input password -> Return Manager
                // Manager's DB password =/= Input password -> Return null
                return pw.equals(manager.getPw());
            }
        } else {
            Student student = studentService.findStudent(id, univ);

            if (student == null) {
                return false;
            } else {
                return pw.equals(student.getPw());
            }
        }
    }
}
