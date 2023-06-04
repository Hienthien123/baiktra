package com.example.crudwiththymeleaf.model;

import jakarta.persistence.*;

@Entity
@Table(name = "PhongBan")
public class PhongBan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private String Ma_Phong;
    @Column
    private  String Ten_Phong;
}