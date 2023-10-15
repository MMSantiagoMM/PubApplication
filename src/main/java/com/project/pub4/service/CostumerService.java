package com.project.pub4.service;


import com.project.pub4.entities.Costumer;
import com.project.pub4.models.CostumerModel;
import com.project.pub4.repository.CostumerRepository;
import org.springframework.stereotype.Service;

@Service
public class CostumerService {

    private final CostumerRepository customerRepository;


    public CostumerService(CostumerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CostumerModel saveCustomer(CostumerModel customerModel){
        Costumer costumer = new Costumer();

        costumer.setName(customerModel.getName());
        costumer.setTelephone(customerModel.getTelephone());
        costumer.setDrinks(customerModel.getDrinks());

        costumer.setTotalPrice(customerModel.getTotalPrice());
        costumer.setId(customerModel.getId());
        customerRepository.save(costumer);



        return customerModel;

    }


}
