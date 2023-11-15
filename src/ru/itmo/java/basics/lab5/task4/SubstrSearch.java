package ru.itmo.java.basics.lab5.task4;

public class SubstrSearch {
    public String str;
    public String substr;

    {
        str = "Lorem ipsum dolor sit amet consectetur adipisicing elit. Eum temporibus sint non explicabo veniam...consectetur adipisicing elit..consectetur adipisicing elit";
        substr = "consectetur adipisicing elit";
    }

    public void substrSearch() {
        System.out.println(str);
        System.out.println("Количество вхождений в строку:\n" + str + "\nподстроки:\n" + substr + "\nравно: " + ((str + "\0").split(substr).length - 1));
    }

    public static void main(String[] args) {
        SubstrSearch res = new SubstrSearch();
        res.substrSearch();
    }
}