package com.example.springapp.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "child")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Child {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int babyId;

    private String babyFirstName;

    private String babyLastName;

    private String fatherName;

    private String motherName;

    private String address;

}