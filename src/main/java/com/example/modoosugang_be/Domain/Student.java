package com.example.modoosugang_be.Domain;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Getter
@Setter             // getter setter 자동생성
@RequiredArgsConstructor    // Constructor 주입 -> DI
@Entity()                   // Connect table in DB
@Table(name = "student")    // DB table name = "student"
public class Student {

    @Id
    @Column(name = "student_id")
    private String id;

    @Column(name = "student_name")
    private String name;
    @Column(name = "student_year")
    private String year;
    @Column(name = "student_birth")
    private Date birth;
    @Column(name = "student_phone")
    private String phone;
    @Column(name = "student_major")
    private String major;
    @Column(name = "student_second_major")
    private String second;
    @Column(name = "student_grade")
    private BigDecimal grade;
    @Column(name = "student_enroll")
    private String enroll;
    @Column(name = "student_credit")
    private int credit;
    @Column(name = "student_pw")
    private String pw;
    @Column(name = "univ_name")
    private String univ;
}
