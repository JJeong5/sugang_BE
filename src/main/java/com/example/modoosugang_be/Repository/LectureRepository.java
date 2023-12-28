package com.example.modoosugang_be.Repository;

import com.example.modoosugang_be.Domain.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LectureRepository extends JpaRepository<Lecture, Long> {

    @Query(value = "SELECT v FROM Lecture v WHERE v.professor Like :univ%")
    List<Lecture> findLecture(@Param("univ")String univ);

    @Query(value = "SELECT v FROM Lecture v WHERE v.professor Like :univ% AND v.id = :id")
    Lecture findLectureByUnivAndID(@Param("univ") String univ, @Param("id") String id);
}
