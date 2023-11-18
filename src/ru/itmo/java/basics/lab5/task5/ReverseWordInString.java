package ru.itmo.java.basics.lab5.task5;

public class ReverseWordInString {
    public String str;

    {
        str = "This is a test string";
    }

    public void wordReverse() {
        String invertedStr = "";
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            StringBuilder stringBuilder = new StringBuilder(words[i]);
            invertedStr = invertedStr.concat(stringBuilder.reverse() + " ");
        }
        System.out.println("Исходная строка: " + str);
        System.out.println("Измененная строка: " + invertedStr);
    }
    public static void main(String[] args) {
        ReverseWordInString res = new ReverseWordInString();
        res.wordReverse();
    }
}