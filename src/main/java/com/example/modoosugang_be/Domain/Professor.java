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
@Table(name = "professor")
public class Professor {

    @Id
    @Column(name = "professor_id")
    private String id;

    @Column(name = "professor_name")
    private String name;
    @Column(name = "professor_major")
    private String major;
    @Column(name = "professor_email")
    private String email;
}
