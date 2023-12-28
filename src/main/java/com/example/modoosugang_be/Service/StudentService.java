package com.example.modoosugang_be.Service;

import com.example.modoosugang_be.Domain.Student;
import com.example.modoosugang_be.Repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public Student findStudent(String id, String univ) {
        Optional<Student> student = studentRepository.findByIdAndUniv(id, univ);

        return student.orElse(null);
    }
}
