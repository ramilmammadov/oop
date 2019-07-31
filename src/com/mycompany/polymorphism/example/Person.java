package com.mycompany.polymorphism.example;

public class Person {
    private String name;

    public Person(){}

    public Person(String name){
        this.name=name;
    }

    public void showName(){
        System.out.println("Name: "+this.name);
    }
}
