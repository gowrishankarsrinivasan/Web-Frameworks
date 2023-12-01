package com.example4.payrollprocessingsystem.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Employee")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    public int id;
    @Column(name = "name")
    public String name;
    @Column(name = "phoneNumber")
    public long phoneNumber;
    @Column(name = "address")
    public String address;
    @Column(name = "email")
    public String email;
    @Column(name = "jobtitle")
    public String jobtitle;
    @Column(name = "department")
    public String department;
    @Column(name = "salary")
    public String salary;
    @Column(name = "hiredate")
    public String hiredate;
}
