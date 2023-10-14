package com.proyect.pub2.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DrinkDTO {

    private Long id;
    private String name;
    private Integer price;
    private Boolean availability;
}
