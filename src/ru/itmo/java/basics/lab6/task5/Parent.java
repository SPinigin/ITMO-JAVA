package ru.itmo.java.basics.lab6.task5;

import java.util.Scanner;

public class Parent {
    protected Integer age;

    public void setAge(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите возраст: ");
        age = scanner.nextInt();
    }

    public String setName(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        return scanner.next();
    }

    public void print(){
        System.out.println("Возраст: " + age);
    }
}