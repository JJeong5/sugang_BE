package com.example.modoosugang_be.Domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter             // getter setter 자동생성
@RequiredArgsConstructor    // Constructor 주입 -> DI
@Entity()                   // Connect table in DB
@Table(name = "student_log")    // DB table name
public class StudentLog {

    @Id
    @Column(name = "log_id")
    private int log;

    @Column(name = "student_id")
    private String id;
    @Column(name = "univ_name")
    private String univ;
    @Column(name = "lecture_id")
    private String lecture;
    @Column(name = "semester")
    private String semester;
    @Column(name = "register_log")
    private Date register;
    @Column(name = "cancle_log")
    private Date cancel;
    @Column(name = "retake_log")
    private String retake;
    @Column(name = "modify_log")
    private Date modify;
}
