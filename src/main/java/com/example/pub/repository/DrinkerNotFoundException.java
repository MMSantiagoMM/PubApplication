package com.example.pub.repository;

public class DrinkerNotFoundException extends RuntimeException{

    public DrinkerNotFoundException(Long id){super("Could not find employee " + id);}
}
