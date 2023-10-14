package com.project.pub3.controller;


import com.project.pub3.entities.Costumer;
import com.project.pub3.models.CustomerModel;
import com.project.pub3.repository.CustomerRepository;
import com.project.pub3.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pub")
public class CustomerController {

    @Autowired
    private final CustomerRepository customerRepository;
    @Autowired
    private final CustomerService customerService;


    public CustomerController(CustomerRepository customerRepository, CustomerService customerService) {
        this.customerRepository = customerRepository;
        this.customerService = customerService;
    }


    @GetMapping("/customers")
    private List<Costumer> getCostumers(){
        return customerRepository.findAll();
    }

    @PostMapping("/costumer")
   public CustomerModel saveCustomer(@RequestBody CustomerModel customer){
        return customerService.saveCustomer(customer);
   }
}
