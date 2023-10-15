package com.test.pubMySql.entity;


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
@Table(name = "Costumers")
public class Costumer {


    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String document;
    private String drink;
    private String total;

}
