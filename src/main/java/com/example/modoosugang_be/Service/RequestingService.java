package com.example.modoosugang_be.Service;

import com.example.modoosugang_be.Domain.Request;
import com.example.modoosugang_be.Repository.RequestingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RequestingService {

    private final RequestingRepository requestingRepository;

    public List<Request> callRequestByProfessor(String professor) {
        return requestingRepository.findAllByProfessor(professor);
    }
}
