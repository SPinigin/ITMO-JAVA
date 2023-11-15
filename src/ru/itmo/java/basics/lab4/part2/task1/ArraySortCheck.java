package ru.itmo.java.basics.lab4.part2.task1;

public class ArraySortCheck {
    static int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5};

    public static void arraySortCheck (int[] array) {
        int index = 0;
        for (int i = 0; i <array.length - 1; i++) {
            if (array[i] > array[i + 1]){
                System.out.println("Please, try again");
            } else {
                index++;
            }
        }
        if (index == array.length - 1){
            System.out.println("Ok");
        }
    }

    public static void main(String[] args) {
        arraySortCheck(array);
    }
}
