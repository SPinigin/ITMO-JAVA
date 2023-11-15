package ru.itmo.java.basics.lab4.part1.task2;

public class Division {
    static int [] numbersArray;

    static {
        numbersArray = new int[100];
    }

    // метод заполнения массива
    static void fillNumbersArray() {
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = i + 1;
            // System.out.println(numbersArray[i]); // вывод полного массива
        }
    }

    // метод сортировки элементов массива, которые делятся на 3
    static void sortNumbersArrayDivisionBy3 (int[] numbersArray) {
        for (int i = 0; i < numbersArray.length; i++){
            if (numbersArray[i] % 3 == 0) {
                System.out.print(numbersArray[i] + " ");
            }
        }
    }

    // метод сортировки элементов массива, которые делятся на 5
    static void sortNumbersArrayDivisionBy5 (int[] numbersArray) {
        for (int i = 0; i < numbersArray.length; i++){
            if (numbersArray[i] % 5 == 0) {
                System.out.print(numbersArray[i] + " ");
            }
        }
    }

    // метод сортировки элементов массива, которые делятся на 3 и 5
    static void sortNumbersArrayDivisionBy3and5 (int[] numbersArray) {
        for (int i = 0; i < numbersArray.length; i++){
            if (numbersArray[i] % 3 == 0 && numbersArray[i] % 5 == 0) {
                System.out.print(numbersArray[i] + " ");
            }
        }
    }

    public static void main (String[] args) {
        fillNumbersArray(); // вызов метода заполнения массива
        System.out.print("Делится на 3: ");
        sortNumbersArrayDivisionBy3(numbersArray); // вызов метода сортировки элементов массива, которые делятся на 3
        System.out.println();
        System.out.print("Делится на 5: ");
        sortNumbersArrayDivisionBy5(numbersArray); // вызов метода сортировки элементов массива, которые делятся на 5
        System.out.println();
        System.out.print("Делится на 3 и 5: ");
        sortNumbersArrayDivisionBy3and5(numbersArray); // вызов метода сортировки элементов массива, которые делятся на 5
    }
}
