package com.mycompany.abstraction.example;

public class MongoDatabase extends AbstractDatabase   {

    @Override
    void update() {
        System.out.println("Updated in MongoDatabase.");
    }

    @Override
    void get() {
        System.out.println("Selected from mysql MongoDatabase.");

    }
}
