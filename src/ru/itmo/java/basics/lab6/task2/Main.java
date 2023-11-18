package ru.itmo.java.basics.lab6.task2;

public class Main {
    public static void main(String[] args){
        Person client = new Client("Сергей", "Пинигин", "Тинькофф");
        Person bankEmployee = new BankEmployee("Иван", "Иванов", "Сбербанк");
        client.info();
        System.out.println(client.entrance());
        bankEmployee.info();
        System.out.println(bankEmployee.entrance());
    }
}