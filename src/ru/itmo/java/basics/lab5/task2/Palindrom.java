package ru.itmo.java.basics.lab5.task2;

public class Palindrom {
    public String word1;
    public String word2;

    {
        word1 = "Шалаш";
        word2 = "Java";
    }

    public void isPalindrom(String word) {
        StringBuilder stringBuilder = new StringBuilder(word);
        stringBuilder.reverse();
        String invertedWord = stringBuilder.toString();
        if (word.equalsIgnoreCase(invertedWord)) {
            System.out.println(word + " - это слово палиндром");
        } else {
            System.out.println(word + " - это слово не палиндром");
        }
    }

    public static void main(String[] args) {
        Palindrom res = new Palindrom();
        res.isPalindrom(res.word1);
        res.isPalindrom(res.word2);
    }
}