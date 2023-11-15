package ru.itmo.java.basics.lab4.part1.task6;

import java.util.Scanner;

public class ArrayCheckOneThree {
    private int[] array;
    private boolean res;

    // метод объявления и заполнения массива
    public void setArray() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int arraySize = scan.nextInt();
        array = new int[arraySize];

        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 21) - 10);
        }
    }

    // метод проверки массива
    public Boolean checkOneThree(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1 || array[i] == 3) {
                res = true;
            }
        }
        return res;
    }

    // метод вывода массива
    public void arrayValues(){
        System.out.print("array = ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print(checkOneThree(array));
    }

    public static void main (String[]args){
        ArrayCheckOneThree check = new ArrayCheckOneThree();
        check.setArray();
        check.arrayValues();
    }
}
