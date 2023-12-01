package com.example.springapp.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.springapp.Models.Child;
import com.example.springapp.Repositories.ChildRepo;

@Service
public class ApiService {

    @Autowired
    private ChildRepo childRepo;

    public Boolean addChild(Child child) {
        try {
            childRepo.save(child);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Child> getChildrenSortedByField(String field) {
        return childRepo.findAll(Sort.by(Sort.Direction.ASC, field));
    }

    public List<Child> getChildrenPaginated(int offset, int pagesize) {
        Page<Child> page = childRepo.findAll(PageRequest.of(offset, pagesize));
        return page.getContent();
    }

    public List<Child> getChildrenPaginatedAndSortedByField(int offset, int pagesize, String field) {
        Page<Child> page = childRepo.findAll(PageRequest.of(offset, pagesize, Sort.by(Sort.Direction.ASC, field)));
        return page.getContent();
    }
}
