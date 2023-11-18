package ru.itmo.java.basics.lab6.task1;

public class Main {
    public static void main(String[] args){
        Person client = new Client("Сергей", "Пинигин", "Тинькофф");
        Person bankEmployee = new BankEmployee("Иван", "Иванов", "Сбербанк");
        client.info();
        bankEmployee.info();
    }
}
