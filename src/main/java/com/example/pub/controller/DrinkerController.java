package com.example.pub.controller;

import com.example.pub.entities.Drinker;
import com.example.pub.model.DrinkerDTO;
import com.example.pub.repository.DrinkerRepository;
import com.example.pub.service.DrinkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DrinkerController {

    @Autowired
    private final DrinkerService drinkerService;
    @Autowired
    private final DrinkerRepository repository;


    public DrinkerController(DrinkerService drinkerService, DrinkerRepository repository) {
        this.drinkerService = drinkerService;
        this.repository = repository;
    }

    @GetMapping("/drinkers")
    List<Drinker> all(){return repository.findAll();}

    @PostMapping("/drinkers")
    DrinkerDTO newDrinker(@RequestBody DrinkerDTO drinker){
        return drinkerService.saveDrinker(drinker);
    }

}
