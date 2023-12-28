package com.example.modoosugang_be.Domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter             // getter setter 자동생성
@RequiredArgsConstructor    // Constructor 주입 -> DI
@Entity()                   // Connect table in DB
@Table(name = "register_lecture")    // DB table name = "register_lecture"
public class RegisterLecture {

    @Id
    @Column(name = "register_lecture_id")
    private int id;

    @Column(name = "lecture_id")
    private String lecture;
    @Column(name = "student_id")
    private String student;
    @Column(name = "semester")
    private String semester;
    @Column(name = "univ_name")
    private String univ;
}
