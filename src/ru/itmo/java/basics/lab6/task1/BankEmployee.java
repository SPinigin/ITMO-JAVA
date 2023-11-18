package ru.itmo.java.basics.lab6.task1;

public class BankEmployee extends Person {
    public String bankName;

    public BankEmployee(String name, String surname, String bankName){
        super(name,surname);
        this.bankName = bankName;
    }

    @Override
    void info(){
        System.out.println("Работник банка: " + "Имя: " + getName() + ", Фамилия: " + getSurname() + ", Банк: " + bankName);
    }
}