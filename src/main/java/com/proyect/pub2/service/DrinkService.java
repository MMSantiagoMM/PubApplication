package com.proyect.pub2.service;

import com.proyect.pub2.entities.Drink;
import com.proyect.pub2.model.DrinkDTO;
import com.proyect.pub2.repository.DrinkRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class DrinkService {

    @Autowired
    private final DrinkRepository drinkRepository;


    public DrinkService(DrinkRepository drinkRepository) {
        this.drinkRepository = drinkRepository;
    }

    public DrinkDTO saveDrink(DrinkDTO drinkDTO){
        Drink drink = new Drink();

        drink.setName(drinkDTO.getName());
        drink.setPrice(drinkDTO.getPrice());
        drink.setAvailability(drinkDTO.getAvailability());

        drinkRepository.save(drink);

        drinkDTO.setId(drink.getId());

        return drinkDTO;

    }
}
