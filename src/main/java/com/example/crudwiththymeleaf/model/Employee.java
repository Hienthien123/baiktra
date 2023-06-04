package com.example.crudwiththymeleaf.model;

import jakarta.persistence.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @NotBlank(message = "Do not empty")
    private long id;
    @Column(name = "first_name")
    @NotNull
    @NotBlank(message = "Do not empty")
    private String firstName;
    @Column(name = "last_name")
    @NotNull
    @NotBlank(message = "Do not empty")
    private String lastName;
    @Column(name = "email")
    @NotNull
    @NotBlank(message = "Do not empty")
    private String email;
    private String NhanVien;

    public String getMa() {
        return Ma;
    }

    public void setMa(String ma) {
        Ma = ma;
    }

    private String Ma;
    private String birth;

    public String getBirth() {
        return birth;
    }


    public void setBirth(String birth) {
        this.birth = birth;
    }



    public String getNhanVien() {
        return NhanVien;
    }

    public void setNhanVien(String nhanVien) {
        NhanVien = nhanVien;
    }



    public Employee(){

    }

    public Employee(long id, String firstName, String lastName, String email,String NhanVien,String birth,String Ma) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.NhanVien = NhanVien;
        this.birth = birth;
        this.Ma = Ma;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
