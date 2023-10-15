package com.proyect.pub2.controller;

import com.proyect.pub2.entities.Drinker;
import com.proyect.pub2.model.DrinkerDTO;
import com.proyect.pub2.repository.DrinkerNotFoundException;
import com.proyect.pub2.repository.DrinkerRepository;
import com.proyect.pub2.service.DrinkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
    private List<Drinker> all(){return repository.findAll();}

    @GetMapping("/drinker/{id}")
    private Drinker one (@PathVariable Long id){
        return repository.findById(id)
                .orElseThrow(()->new DrinkerNotFoundException(id));
    }


    @PostMapping("/drinkers")
    private DrinkerDTO newDrinker(@RequestBody DrinkerDTO drinker){
        return drinkerService.saveDrinker(drinker);
    }

/*
   @PutMapping("/drinker/{id}")
    Drinker replaceDrinker(@RequestBody DrinkerDTO newDrinker, @PathVariable Long id){

        return repository.findById(id)
                .map(drinker -> {
                    drinker.setName(newDrinker.getName());
                    drinker.setDocument(newDrinker.getDocument());
                    drinker.setDrink(newDrinker.getDrink());
                    drinker.setCostDrink(newDrinker.getCostDrink());
                    drinker.setOffer(newDrinker.getOffer());
                    drinker.setCostOffer(newDrinker.getCostOffer());
                    drinker.setTotal(newDrinker.getTotal());
                    return repository.save(drinker);
                })
                .orElseGet(()->{
                    newDrinker.setId(id);
                    return repository.save(newDrinker);
                });

    }*/
}
