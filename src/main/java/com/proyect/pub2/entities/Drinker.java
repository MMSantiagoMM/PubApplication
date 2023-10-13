package com.proyect.pub2.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

@Table(name = "Drinkers")
public class Drinker {

    private @Id
    @GeneratedValue Long id;
    private String name;
    private String document;
    private String drink;
    private Integer costDrink;
    private String offer;
    private Integer costOffer;
    private Integer total;

}
