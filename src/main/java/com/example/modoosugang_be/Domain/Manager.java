package com.example.modoosugang_be.Domain;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter             // getter setter 자동생성
@RequiredArgsConstructor    // Constructor 주입 -> DI
@Entity()                   // Connect table in DB
@Table(name = "manager")    // DB table name = "manager"
public class Manager {

    @Id
    @Column(name = "manager_id")
    private String id;  // Primary Key

    @Column(name = "univ_name")   // DB column "university_name" -> "univ"
    private String univ;
    @Column(name = "manager_email")
    private String email;
    @Column(name = "manager_pw")
    private String pw;
}
