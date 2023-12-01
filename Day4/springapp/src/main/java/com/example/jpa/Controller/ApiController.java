package com.example.jpa.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.Models.Student;
import com.example.jpa.Service.ApiService;

@RestController
public class ApiController {

    @Autowired
    private ApiService apiService;

    @PostMapping("/")
    public boolean saveStudent(@RequestBody Student employee) {
        return (apiService.saveStudent(employee) != null);
    }

    @GetMapping("/")
    public List<Student> getAllStudents() {
        return apiService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {
        return apiService.getStudentById(id);
    }

    @PutMapping("/{id}")
    public Student updateStudentById(@PathVariable int id, @RequestBody Student student) {
        return apiService.updateStudentById(id, student);
    }

    @DeleteMapping("/{id}")
    public boolean deleteStudentById(@PathVariable int id) {
        return apiService.deleteStudentById(id);
    }
}
