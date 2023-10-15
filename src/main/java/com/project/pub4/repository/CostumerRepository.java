package com.project.pub4.repository;

import com.project.pub4.entities.Costumer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CostumerRepository extends CrudRepository<Costumer,Long> {
}
