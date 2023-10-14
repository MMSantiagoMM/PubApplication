package com.proyect.pub2.repository;

public class DrinkNotFoundException extends RuntimeException {

    public DrinkNotFoundException(Long id){super("Could not find drink " + id);}
}
