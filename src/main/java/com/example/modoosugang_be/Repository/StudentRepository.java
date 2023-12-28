package com.example.modoosugang_be.Repository;

import com.example.modoosugang_be.Domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findByIdAndUniv(String id, String univ);
}
