package com.proyect.pub2.repository;

public class DrinkerNotFoundException extends RuntimeException{

    public DrinkerNotFoundException(Long id){super("Could not find drinker " + id);}
}
