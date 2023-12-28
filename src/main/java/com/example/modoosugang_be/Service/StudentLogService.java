package com.example.modoosugang_be.Service;

import com.example.modoosugang_be.Domain.StudentLog;
import com.example.modoosugang_be.Repository.StudentLogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentLogService {

    private final StudentLogRepository studentLogRepository;

    public List<StudentLog> findStudentLog(String univ, String id) {
        List<StudentLog> logs = studentLogRepository.findAllByUnivAndId(univ, id);
//        List<StudentLog> logs = studentLogRepository.findAll();
        return logs;
    }

}
