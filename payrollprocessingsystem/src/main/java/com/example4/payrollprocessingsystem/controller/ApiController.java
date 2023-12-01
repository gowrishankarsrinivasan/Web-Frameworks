package com.example4.payrollprocessingsystem.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example4.payrollprocessingsystem.model.Employee;
import com.example4.payrollprocessingsystem.service.ApiService;
@RestController
public class ApiController {
    @Autowired
    private ApiService employeeService; 
    
    
    @PostMapping("/")
    
    public Employee addEmployee(@RequestBody Employee employee)
    {
        return employeeService.addEmployee(employee);    
    }

    @GetMapping("/")
   
    public List <Employee> getAllEmployees()
    {
       return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    
    
    public Employee getEmployeeById(@PathVariable int id)
{
    return employeeService.getEmployeeById(id);
}

@PutMapping("/{id}")
public Employee updateBook(@PathVariable int id,@RequestBody Employee b){
    return employeeService.updateBook(id, b);
}

//starts with
@GetMapping("/startsWith/{name}")
public List <Employee> getNameStartingwithletter(@PathVariable String name){
    return employeeService.findBynamesStarttingwith(name);
}
@GetMapping("/endsWith/{name}")
public List<Employee> getNameEndingwithLetter(@PathVariable String name)
{
    return employeeService.getNameEndingwithLetter(name);
}

//Contain
@GetMapping("/contain/{name}")
public List<Employee> getLetterContaining(@PathVariable String name)
{
    return employeeService.getLetterContaining(name);
}

//IsContaining
@GetMapping("/isContain/{name}")
public List<Employee> getNameContaining(@PathVariable String name)
{
    return employeeService.getNameContaining(name);
}

//notstarts with
@GetMapping("/notstartWith/{name}")
public List <Employee> getdepartmentNotLike(@PathVariable String name)
{
    return employeeService.getdepartmentNotLike(name);
}
//not contain
@GetMapping("/notLike/{name}")
public List <Employee> getdepartmentNameNotLike(@PathVariable String name)
{
    return employeeService.getdepartmentNameNotLike(name);
}


}
