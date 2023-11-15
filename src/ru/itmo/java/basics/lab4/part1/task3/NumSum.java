package ru.itmo.java.basics.lab4.part1.task3;

import java.util.Scanner;

public class NumSum {
    private int a;
    private int b;
    private int c;
    private boolean res;

    // ввод данных
    public void SetNum() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        a = scan.nextInt();
        System.out.print("Введите второе число: ");
        b = scan.nextInt();
        System.out.print("Введите третье число: ");
        c = scan.nextInt();
    }

    // метод проверки и возврата результата
    public String result(){
        if ((a + b) == c) {
            res = true;
        }
        return "Результат: " + res;
    }

    // метод вывода результата
    public void resultValue() {
        System.out.println(result());
    }

    public static void main(String[] args) {
        NumSum numSum = new NumSum();
        numSum.SetNum();
        numSum.resultValue();
    }
}