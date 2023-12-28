package com.example.modoosugang_be.Domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter             // getter setter 자동생성
@RequiredArgsConstructor    // Constructor 주입 -> DI
@Entity()                   // Connect table in DB
@Table(name = "schedule")    // DB table name = "schedule"
public class Schedule implements Serializable {

    @Id
    @Column(name = "id_schedule")
    private String Id;

    @Column(name = "semester")
    private String semester;

    @Column(name = "basket_start")
    private String BasketStart;

    @Column(name = "basket_end")
    private String BasketEnd;

    @Column(name = "register_start")
    private String RegisterStart;

    @Column(name = "register_end")
    private String RegisterEnd;

    @Column(name = "modify_start")
    private String ModifyStart;

    @Column(name = "modify_end")
    private String ModifyEnd;

    @Column(name = "cancle_start")
    private String CancleStart;

    @Column(name = "cancle_end")
    private String CancleEnd;



}
