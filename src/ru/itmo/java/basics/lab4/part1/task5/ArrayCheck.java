package ru.itmo.java.basics.lab4.part1.task5;

import java.util.Scanner;

public class ArrayCheck {
    private int[] array;
    private boolean res;

    // метод объявления и заполнения массива
    public void setArray() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите длину массива с количеством элементов больше или равным двум: ");
        int arraySize = scan.nextInt();
        array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.print("Введите элемент массива: ");
            array[i] = scan.nextInt();
        }
    }

    // метод проверки массива
    public Boolean check3(int[] array){
        for (int i = 0; i < array.length; i++){
            if (array[i] == 3 || array[array.length-1] == 3) {
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
        System.out.print(check3(array));
    }

    public static void main (String[]args){
        ArrayCheck check = new ArrayCheck();
        check.setArray();
        check.arrayValues();
        }
    }