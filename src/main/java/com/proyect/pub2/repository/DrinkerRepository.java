package com.proyect.pub2.repository;

import com.proyect.pub2.entities.Drinker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinkerRepository extends JpaRepository<Drinker,Long> {
}
