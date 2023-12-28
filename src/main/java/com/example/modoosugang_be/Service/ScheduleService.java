package com.example.modoosugang_be.Service;


import com.example.modoosugang_be.Domain.Schedule;
import com.example.modoosugang_be.Repository.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@RequiredArgsConstructor
public class ScheduleService {
    private final ScheduleRepository scheduleRepository;

    public Schedule FindCol(String semester) {
        Optional<Schedule> schedule = scheduleRepository.findBySemester(semester);
        return schedule.orElse(null); // 조회 성공하면 Manager값, 실패시 null
    }

    public int setPeriodBasket(String start, String end, String id) {
        int schedule = scheduleRepository.updateBasket(start, end, id);

        return schedule;
    }

    public int setPeriodRegister(String start, String end, String id) {
        int schedule = scheduleRepository.updateRegister(start, end, id);

        return schedule;
    }

    public int setPeriodModify(String start, String end, String id) {
        int schedule = scheduleRepository.updateModify(start, end, id);

        return schedule;
    }

    public int setPeriodCancle(String start, String end, String id) {
        int schedule = scheduleRepository.updateCancle(start, end, id);

        return schedule;
    }


}
