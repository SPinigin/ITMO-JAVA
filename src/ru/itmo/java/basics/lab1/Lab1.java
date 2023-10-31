package ru.itmo.java.basics.lab1;

import java.util.Scanner;

public class Lab1 {
    public static void main (String args[]){
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }
    static void task1(){
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java");
    }
    static void task2(){
        System.out.println((46+10) * (10 / 3d));
        System.out.println(29 * 4 * (-15));
    }
    static void task3(){
        int number = 10500;
        double result = ((double) number / 10 / 10);
        System.out.println(result);
    }
    static void task4(){
        float a = 3.6f;
        float b = 4.1f;
        float c = 5.9f;
        float result = a * b * c;
        System.out.println(result);
    }
    static void task5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a: ");
        int a = scanner.nextInt();
        System.out.println("Введите число b: ");
        int b = scanner.nextInt();
        System.out.println("Введите число c: ");
        int c = scanner.nextInt();
        System.out.println(a + "\n" + b + "\n" + c);
    }
    static void task6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число b: ");
        int b = scanner.nextInt();
        if (b % 2 != 0) {
            System.out.println("Нечетное");
        } else if (b % 2 == 0 && b > 100) {
            System.out.println("Выход за пределы диапазона");
        } else if (b % 2 == 0) {
            System.out.println("Четное");
        }
    }
}
