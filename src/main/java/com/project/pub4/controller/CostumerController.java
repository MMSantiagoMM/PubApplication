package com.project.pub4.controller;

import com.project.pub4.entities.Costumer;
import com.project.pub4.models.CostumerModel;
import com.project.pub4.repository.CostumerRepository;
import com.project.pub4.service.CostumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pub")
public class CostumerController {

    @Autowired
    private final CostumerRepository costumerRepository;
    @Autowired
    private final CostumerService costumerService;


    public CostumerController(CostumerRepository costumerRepository, CostumerService costumerService) {
        this.costumerRepository = costumerRepository;
        this.costumerService = costumerService;
    }


    @GetMapping("/customers")
    private List<Costumer> getCostumers(){
        return (List<Costumer>) costumerRepository.findAll();
    }

    @PostMapping("/costumer")
   public CostumerModel saveCostumer(@RequestBody CostumerModel costumer){
        return costumerService.saveCustomer(costumer);
   }
}
