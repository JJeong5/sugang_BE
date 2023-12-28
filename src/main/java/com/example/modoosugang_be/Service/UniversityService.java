package com.example.modoosugang_be.Service;

import com.example.modoosugang_be.Domain.University;
import com.example.modoosugang_be.Repository.UniversityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class UniversityService {
    private final UniversityRepository universityRepository;

    public ArrayList<University> findUniversity() {
        return (ArrayList<University>) universityRepository.findAll();
    }


}
