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
@Table(name = "requesting")
public class Request {

    @Id
    @Column(name = "requesting_id")
    private int id;

    @Column(name = "professor_id")
    private String professor;
    @Column(name = "lecture_id")
    private String lecture;
}
