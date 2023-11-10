package ru.itmo.java.basics.lab3.task2;

public class Car {
    private String color;
    private String name;
    private Double weght;

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, Double weght){
        this.color = color;
        this.weght = weght;
    }

    public Car() {
    }

    public Car(String name, String color, Double weght){
        this.name = name;
        this.color = color;
        this.weght = weght;
    }

    public void Show(){
        System.out.println(name);
        System.out.println(color);
        System.out.println(weght);
    }
}
