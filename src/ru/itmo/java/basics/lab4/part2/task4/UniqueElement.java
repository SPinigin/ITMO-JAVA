package ru.itmo.java.basics.lab4.part2.task4;

import java.util.Scanner;

public class UniqueElement {
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

    // метод поиска уникального значения массива
    public static void searchFirstUniqueElement (int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean result = true;
            for (int j = 0; j < array.length && result; j++)
                result = (i == j || array[i] != array[j]);
            if (result) {
                System.out.print("Первое уникальное значение массива: ");
                System.out.println(array[i]);
                break;
            }
        }
    }

    public static void main(String[] args){
        setArray();
        searchFirstUniqueElement(array);
    }
}