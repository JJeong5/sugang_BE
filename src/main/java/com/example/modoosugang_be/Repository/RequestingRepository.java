package com.example.modoosugang_be.Repository;

import com.example.modoosugang_be.Domain.Request;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RequestingRepository extends JpaRepository<Request, Long> {
    List<Request> findAllByProfessor(String professor);
}
