package com.dev.app.devspring.controller;

import com.dev.app.devspring.entity.Priority;
import com.dev.app.devspring.repository.PriorityRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/priority")
public class PriorityController {
    private PriorityRepository priorityRepository;
    public PriorityController(PriorityRepository priorityRepository) {
        this.priorityRepository = priorityRepository;
    }
@GetMapping("/test")
    public List<Priority> test(){
    List<Priority>list=priorityRepository.findAll();
    System.out.println("list"+ list);
    return list;
    }
}
