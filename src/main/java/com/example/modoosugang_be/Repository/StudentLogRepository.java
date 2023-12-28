package com.example.modoosugang_be.Repository;

import com.example.modoosugang_be.Domain.StudentLog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentLogRepository extends JpaRepository<StudentLog, Long> {
    List<StudentLog> findAllByUnivAndId(String univ, String id);
}
