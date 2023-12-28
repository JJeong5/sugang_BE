package com.example.modoosugang_be.Service;

import com.example.modoosugang_be.Domain.Professor;
import com.example.modoosugang_be.Repository.ProfessorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProfessorService {
    private final ProfessorRepository professorRepository;

    public List<Professor> callProfessorList(){
        return professorRepository.findAll();
    }
}
