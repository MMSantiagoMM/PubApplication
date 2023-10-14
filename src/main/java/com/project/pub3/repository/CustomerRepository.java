package com.project.pub3.repository;

import com.project.pub3.entities.Costumer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<Costumer,Long> {
}
