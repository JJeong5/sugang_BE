package com.example.modoosugang_be.Controller;

import com.example.modoosugang_be.Domain.University;
import com.example.modoosugang_be.Service.UniversityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
//@RequestMapping(value = "/api")
@RequiredArgsConstructor
public class SelectUnivController {

    private final UniversityService universityService;


    @RestController
    public class univ_list {

        @PostMapping("/home/univ")
        public ArrayList<University> test1() {

            return universityService.findUniversity();
        }
    }

}
