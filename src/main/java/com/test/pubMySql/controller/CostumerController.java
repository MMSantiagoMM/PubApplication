package com.test.pubMySql.controller;


import com.test.pubMySql.entity.Costumer;
import com.test.pubMySql.repository.CostumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pub")
public class CostumerController {


    @Autowired
    private CostumerRepository costumerRepository;

    @GetMapping("/AllCostumers")
    private List<Costumer> allCostumers(){
        return costumerRepository.findAll();
    }

    @PostMapping("/insert")
    private Costumer insert(@RequestBody Costumer costumer){
        return costumerRepository.save(costumer);
    }


}
