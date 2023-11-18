package ru.itmo.java.basics.lab6.task3;

public class Main {
    public static void main(String[] args){
        Car truck = new Truck(5000, "Mercedes-Benz", 'W', 150, 8, 30000);
        truck.outPut();
        ((Truck) truck).newWheelsQuantity();
    }
}