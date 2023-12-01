package com.example.springapp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.Models.Child;
import com.example.springapp.Services.ApiService;

@RestController
public class ApiController {

    @Autowired
    private ApiService apiService;

    @PostMapping("/")
    public Boolean addChild(@RequestBody Child child) {
        return apiService.addChild(child);
    }

    @GetMapping("/{field}")
    public List<Child> getChildrenSortedByField(@PathVariable String field) {
        return apiService.getChildrenSortedByField(field);
    }

    @GetMapping("/{offset}/{pagesize}")
    public List<Child> getChildrenPaginated(@PathVariable int offset, @PathVariable int pagesize) {
        return apiService.getChildrenPaginated(offset, pagesize);
    }

    @GetMapping("/{offset}/{pagesize}/{field}")
    public List<Child> getChildrenPaginatedAndSortedByField(@PathVariable int offset, @PathVariable int pagesize,
            @PathVariable String field) {
        return apiService.getChildrenPaginatedAndSortedByField(offset, pagesize, field);
    }

}
