package com.proyect.pub2.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

@Table(name = "Drinks")
public class Drink {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Integer price;
    private Boolean availability;
}