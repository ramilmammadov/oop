package com.mycompany.abstraction.example;

public class MysqlDatabase extends AbstractDatabase   {

    @Override
    void update() {
        System.out.println("Updated in MysqlDatabase.");
    }

    @Override
    void get() {
        System.out.println("Selected from mysql MysqlDatabase.");

    }
}
