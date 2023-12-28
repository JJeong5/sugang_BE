package com.example.modoosugang_be.Repository;

import com.example.modoosugang_be.Domain.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import java.util.Optional;

public interface ManagerRepository extends JpaRepository<Manager, Long>{
    Optional<Manager> findByIdAndUniv(String id, String univ);
}
