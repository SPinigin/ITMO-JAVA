package ru.itmo.java.basics.lab6.task3;

import java.util.Scanner;

public class Truck extends Car {
    private int wheelsQuantity;
    private int maxWeight;

    public Truck(int w, String m, char c, float s, int wheelsQuantity, int maxWeight) {
        super(w, m, c, s);
        this.wheelsQuantity = wheelsQuantity;
        this.maxWeight = maxWeight;
    }

    @Override
    public void outPut () {
        System.out.println("Вес " + model + " составляет " + weight + "кг.");
        System.out.println("Цвет машины - " + color + " и её скорость - " + speed);
        System.out.println("Количество колёс: " + wheelsQuantity);
        //System.out.println("Максимальный вес: " + maxWeight + "кг.");
    }

    public void newWheelsQuantity(){
        System.out.print("Введите новое значение для количества колёс: ");
        Scanner scanner = new Scanner(System.in);
        wheelsQuantity = scanner.nextInt();
        outPut();
    }
}