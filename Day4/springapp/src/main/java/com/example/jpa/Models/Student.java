package com.example.jpa.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "student")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "studentName")
    private String studentName;

    @Column(name = "departmentName")
    private String departmentName;

    @Column(name = "mailid")
    private String mailid;
}