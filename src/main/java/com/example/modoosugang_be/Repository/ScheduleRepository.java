package com.example.modoosugang_be.Repository;

import com.example.modoosugang_be.Domain.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface ScheduleRepository extends JpaRepository<Schedule, Long>{
    Optional<Schedule> findBySemester(String semester);

    @Transactional
    @Modifying
    @Query("update Schedule m set m.BasketStart = :start , m.BasketEnd = :end where m.Id = :id")
    int updateBasket(String start, String end, String id);

    @Transactional
    @Modifying
    @Query("update Schedule m set m.RegisterStart = :start , m.RegisterEnd = :end where m.Id = :id")
    int updateRegister(String start, String end, String id);

    @Transactional
    @Modifying
    @Query("update Schedule m set m.ModifyStart = :start , m.ModifyEnd = :end where m.Id = :id")
    int updateModify(String start, String end, String id);

    @Transactional
    @Modifying
    @Query("update Schedule m set m.CancleStart = :start , m.CancleEnd = :end where m.Id = :id")
    int updateCancle(String start, String end, String id);

}
