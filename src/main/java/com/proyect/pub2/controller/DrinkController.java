package com.proyect.pub2.controller;


import com.proyect.pub2.entities.Drink;
import com.proyect.pub2.model.DrinkDTO;
import com.proyect.pub2.repository.DrinkNotFoundException;
import com.proyect.pub2.repository.DrinkRepository;
import com.proyect.pub2.service.DrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DrinkController {


    @Autowired
    private final DrinkRepository drinkRepository;

    @Autowired
    private final DrinkService drinkService;


    public DrinkController(DrinkRepository drinkRepository, DrinkService drinkService) {
        this.drinkRepository = drinkRepository;
        this.drinkService = drinkService;
    }

    @GetMapping("/drinks")
    private List<Drink> all(){return drinkRepository.findAll();}


    @GetMapping("/findDrink/{id}")
    private Drink getOne(@PathVariable Long id){
        return drinkRepository.findById(id)
                .orElseThrow(()->new DrinkNotFoundException(id));
    }

    @PostMapping("/create")
    private DrinkDTO createDrink(@RequestBody DrinkDTO drinkDTO){
        return drinkService.saveDrink(drinkDTO);
    }

}
