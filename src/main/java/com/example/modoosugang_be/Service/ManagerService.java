package com.example.modoosugang_be.Service;

import com.example.modoosugang_be.Domain.Manager;
import com.example.modoosugang_be.Repository.ManagerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ManagerService {
    private final ManagerRepository managerRepository;

    public Manager findManager(String id, String univ) {
        Optional<Manager> manager = managerRepository.findByIdAndUniv(id, univ);

        return manager.orElse(null); // 조회 성공하면 Manager값, 실패시 null
    }
}
