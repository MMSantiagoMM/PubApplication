package com.example.pub.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DrinkerDTO {

    private Long id;
    private String name;
    private String document;
    private String drink;
    private Integer costDrink;
    private String offer;
    private Integer costOffer;
    private Integer total;
}
