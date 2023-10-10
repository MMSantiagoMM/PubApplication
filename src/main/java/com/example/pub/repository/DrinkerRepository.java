package com.example.pub.repository;

import com.example.pub.entities.Drinker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrinkerRepository extends JpaRepository<Drinker,Long> {
}
