package com.example.jpa.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa.Models.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
