package com.test.pubMySql.repository;

import com.test.pubMySql.entity.Costumer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CostumerRepository extends JpaRepository<Costumer,Integer> {
}
