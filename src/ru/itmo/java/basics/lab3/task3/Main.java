package ru.itmo.java.basics.lab3.task3;

public class Main {
    public static void main(String[] args) {
        House house_1 = new House();
        house_1.Set(15, 2021, "Novin");
        System.out.println(house_1.houseAge());

        House house_2 = new House();
        house_2.Set(9, 1987, "Shirotnaya");
        System.out.println(house_2.houseAge());
    }
}