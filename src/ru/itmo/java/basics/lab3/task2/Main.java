package ru.itmo.java.basics.lab3.task2;

public class Main {
    public static void main (String[] args){

        Car car_1 = new Car("white",1530.5);
        Car car_2 = new Car("white");

        Car car_3 = new Car("Mercedes-Benz","white",1530.5);

        car_1.Show();
        car_2.Show();
        car_3.Show();
    }
}
