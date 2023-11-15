package ru.itmo.java.basics.lab4.part2.task3;

import java.util.Arrays;
import java.util.Scanner;

public class ChangePosition {
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

    // метод смены местами первого и последнего индексов массива
    static void changePosition(int[] array){
        for (int i = 0; i < array.length; i= array.length - 1) {
            for (int j = 0; j < array.length; j = array.length - 1) {
                if (array[i] < array[j]) {
                    int aj = array[j];
                    int ai = array[i];
                    array[j] = ai;
                    array[i] = aj;
                    break;
                }
            }
            break;
        }
    }

    // метод вывода первоначального массива
    static void printArray() {
        System.out.print("Array 1: " + Arrays.toString(array));
        System.out.println();
    }

    // метод вывода измененного массива
    static void printChangedArray() {
        System.out.print("Array 2: " + Arrays.toString(array));
    }

    public static void main(String[] args){
        setArray();
        printArray();
        changePosition(array);
        printChangedArray();
    }
}

