package com.example4.payrollprocessingsystem.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example4.payrollprocessingsystem.model.Employee;
import com.example4.payrollprocessingsystem.repository.ApiRepository;

@Service
public class ApiService {
    @Autowired
    private  ApiRepository employeeRepo;
    public Employee addEmployee(Employee employee)
    {
        return employeeRepo.save(employee);
    }
    public List <Employee> getAllEmployees()
    {
        return employeeRepo.findAll();
    }
    public Employee getEmployeeById(int id)
    {
        return employeeRepo.findById(id).get();
    }
        //4.updating all details.
        public Employee updateBook(int id, Employee e){
            e.setId(id);
            return employeeRepo.saveAndFlush(e);
        }



    //finding matching strings.


    public List <Employee> findBynamesStarttingwith(String name)
    {
        return employeeRepo.findBynamesStarttingwith(name);
    }
    public List <Employee> getNameEndingwithLetter(String name)
    {
        return employeeRepo.findByNamesEndingWith(name);
    }
    public List <Employee> getLetterContaining(String name)
    {
        return employeeRepo.findLetterContaining(name);
    }
    public List <Employee> getNameContaining(String name)
    {
        return employeeRepo.findNameContaining(name);
    }



    public List <Employee> getdepartmentNotLike(String name)
    {
        return employeeRepo.finddepartmentNotLike(name);
    }
    public List <Employee> getdepartmentNameNotLike(String name)
    {
        return employeeRepo.finddepartmentNameNotLike(name);
    }




}
