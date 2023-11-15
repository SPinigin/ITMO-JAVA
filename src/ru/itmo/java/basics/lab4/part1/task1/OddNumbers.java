package ru.itmo.java.basics.lab4.part1.task1;

public class OddNumbers {
   static int [] numbersArray;

   static {
       numbersArray = new int[99];
   }

   // метод заполнения массива
   static void fillNumbersArray() {
       for (int i = 0; i < numbersArray.length; i++) {
           numbersArray[i] = i + 1;
           //System.out.println(numbersArray[i]); // вывод полного массива
       }
   }

   // метод сортировки массива
   static void sortNumbersArray (int[] numbersArray) {
       for (int i = 0; i < numbersArray.length; i++){
           if (numbersArray[i] % 2 !=0) {
               System.out.println(numbersArray[i]);
           }
       }
   }

   public static void main (String[] args) {
       fillNumbersArray(); // вызов метода заполнения массива
       sortNumbersArray(numbersArray); // вызов метода сортировки массива
   }
}