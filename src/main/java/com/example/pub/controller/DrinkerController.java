package com.example.pub.controller;

import com.example.pub.entities.Drinker;
import com.example.pub.model.DrinkerDTO;
import com.example.pub.repository.DrinkerNotFoundException;
import com.example.pub.repository.DrinkerRepository;
import com.example.pub.service.DrinkerService;
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
    List<Drinker> all(){return repository.findAll();}

    @GetMapping("/drinker/{id}")
    Drinker one (@PathVariable Long id){
        return repository.findById(id)
                .orElseThrow(()->new DrinkerNotFoundException(id));
    }


    @PostMapping("/drinkers")
    DrinkerDTO newDrinker(@RequestBody DrinkerDTO drinker){
        return drinkerService.saveDrinker(drinker);
    }


   @PutMapping("/drinker/{id}")
    Drinker replaceDrinker(@RequestBody DrinkerDTO newDrinker, @PathVariable Long id){

       /* return repository.findById(id)
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
