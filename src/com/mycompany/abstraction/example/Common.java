package com.mycompany.abstraction.example;

public class Common {

    public void delete() {
        new MongoDatabase().delete();
    }
}
