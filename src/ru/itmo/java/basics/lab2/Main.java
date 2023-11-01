package ru.itmo.java.basics.lab2;

public class Main {
    public static void main(String[] args) {

        //task1
        Calculator calc = new Calculator();

        System.out.println("Сложение:");
        System.out.println(calc.addition(5, 10));
        System.out.println(calc.addition(5.5, 10.10));
        System.out.println(calc.addition(50000000L, 100000000L) + "\n");

        System.out.println("Деление:");
        System.out.println(calc.division(5, 10));
        System.out.println(calc.division(5.5, 10.10));
        System.out.println(calc.division(50000000L, 100000000L) + "\n");

        System.out.println("Умножение:");
        System.out.println(calc.multiplication(5, 10));
        System.out.println(calc.multiplication(5.5, 10.10));
        System.out.println(calc.multiplication(50000000L, 100000000L) + "\n");

        System.out.println("Вычитание:");
        System.out.println(calc.subtraction(5, 10));
        System.out.println(calc.subtraction(5.5, 10.10));
        System.out.println(calc.subtraction(50000000L, 100000000L) + "\n");

        //task2
        Geolog geolog = new Geolog("Sergey", "Pinigin");
        Geolog geolog1 = new Geolog("Sergey", "Pinigin", "male");
        System.out.println(geolog.getName() + " " + geolog.getSurname() + "\n");
        System.out.println(geolog1.getName() + " " + geolog1.getSurname() + " " + geolog1.getGender());
    }
}

