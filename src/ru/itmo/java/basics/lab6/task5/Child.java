package ru.itmo.java.basics.lab6.task5;

public class Child extends Parent{
    protected String name;

    public Child(){
        name = setName();
    }

    @Override
    public void print(){
        System.out.println("Имя: " + name);
    }
}