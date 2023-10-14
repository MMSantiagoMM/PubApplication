package com.project.pub3.service;

import com.project.pub3.entities.Costumer;
import com.project.pub3.models.CustomerModel;
import com.project.pub3.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;


    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerModel saveCustomer(CustomerModel customerModel){
        Costumer costumer = new Costumer();

        costumer.setName(customerModel.getName());
        costumer.setTelephone(costumer.getTelephone());
        costumer.setDrinks(customerModel.getDrinks());

        costumer.setTotalPrice(customerModel.getTotalPrice());
        costumer.setId(customerModel.getId());
        customerRepository.save(costumer);



        return customerModel;

    }


}
