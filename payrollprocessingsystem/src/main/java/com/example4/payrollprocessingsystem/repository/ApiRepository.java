package com.example4.payrollprocessingsystem.repository;


import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example4.payrollprocessingsystem.model.Employee;


@EnableAutoConfiguration
@EntityScan(basePackages = "com.example4.payrollprocessingsystem.model")
public interface ApiRepository extends JpaRepository<Employee,Integer> {

        // STARTING WITH
@Query(value="Select * from Employee where name like ?1%",nativeQuery=true)    
public List <Employee> findBynamesStarttingwith(String name);
    // ENDING WITH 
@Query(value = "Select * from Employee where name like %?1", nativeQuery = true)
public List <Employee> findByNamesEndingWith(String name);
    // CONTAIN QUERY 
@Query(value = "Select * from Employee where name like %?1%", nativeQuery = true)
public List <Employee> findLetterContaining(String name);
    // ISCONTAINING QUERY 
@Query(value = "Select * from Employee where name like ?1", nativeQuery = true)
public List <Employee> findNameContaining(String name);



    //  NOT LIKE
    @Query(value="Select * from Employee where name NOT LIKE ?1% ",nativeQuery=true)
    public List <Employee> finddepartmentNotLike(String name);
    //NOT CONTAIN
    @Query(value="Select * from Employee where name NOT LIKE %?1% ",nativeQuery=true)
    public List <Employee> finddepartmentNameNotLike(String name); 

      
}
