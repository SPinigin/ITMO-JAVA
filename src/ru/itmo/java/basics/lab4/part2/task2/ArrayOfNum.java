package ru.itmo.java.basics.lab4.part2.task2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfNum {
    static int[] array;

    // метод объявления и заполнения массива
    static void setArray() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int arraySize = scan.nextInt();
        array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.print("Введите элемент массива: ");
            array[i] = scan.nextInt();
        }
    }

    // метод вывода данных массива
    static void arrayValues() {
        System.out.println("Array length: " + array.length);
        System.out.println("Numbers of array: ");
        for (int i =0; i < array.length; i++){
            System.out.println(array[i]);
        }
        System.out.print("Result: " + Arrays.toString(array));

    }
    public static void main(String[] args) {
        ArrayOfNum.setArray();
        ArrayOfNum.arrayValues();
    }
}