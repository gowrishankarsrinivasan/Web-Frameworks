package com.example.springapp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springapp.Models.Child;

public interface ChildRepo extends JpaRepository<Child, Integer> {

}
