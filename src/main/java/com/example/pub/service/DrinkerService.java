package com.example.pub.service;

import com.example.pub.entities.Drinker;
import com.example.pub.model.DrinkerDTO;
import com.example.pub.repository.DrinkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DrinkerService {

    @Autowired
    private final DrinkerRepository repository;

    public DrinkerService(DrinkerRepository repository) {
        this.repository = repository;
    }

    public DrinkerDTO saveDrinker(DrinkerDTO drinkerDTO){
        Drinker drinker = new Drinker();

        drinker.setName(drinkerDTO.getName());
        drinker.setDocument(drinkerDTO.getDocument());
        drinker.setDrink(drinkerDTO.getDrink());
        drinker.setOffer(drinkerDTO.getOffer());

        drinkerDTO.setCostDrink(calculatePriceDrink(drinker.getDrink()));
        drinker.setCostDrink(drinkerDTO.getCostDrink());

        drinkerDTO.setCostOffer(calculatePriceOffer(drinker.getOffer()));
        drinker.setCostOffer(drinkerDTO.getCostOffer());

        drinkerDTO.setTotal(calculateTotalBill(drinker.getCostDrink(),drinker.getCostOffer()));
        drinker.setTotal(drinkerDTO.getTotal());

        repository.save(drinker);

        drinkerDTO.setId(drinker.getId());

        return drinkerDTO;

    }

    private Integer calculatePriceDrink(String drink){
        switch (drink){
            case "Beer" -> {return 10000;}
            case "Rum" -> {return 80000;}
            case "Tequila" -> {return 15000;}
            case "Water" -> {return 20000;}
            case "Whiskey" -> {return 25000;}
            default -> {return 18000;}
        }
    }

    private Integer calculatePriceOffer(String packageAlcohol){

        switch (packageAlcohol){
            case "Three beers" -> {return 25000;}
            case "Rum bottle" -> {return 75000;}
            case "Two water glasses" -> {return 22000;}
            case "Vodka bottle" -> {return 125000;}
            case "Eight beers" -> {return 60000;}
            default -> {return 100000;}
        }
    }

    private Integer calculateTotalBill(Integer drink, Integer offer){
        return (int) (drink + offer + ((drink + offer)*0.19));

    }
}
