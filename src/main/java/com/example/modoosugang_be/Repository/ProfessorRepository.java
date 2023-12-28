package com.example.modoosugang_be.Repository;

import com.example.modoosugang_be.Domain.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
    List<Professor> findAll();
}
