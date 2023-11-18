package ru.itmo.java.basics.lab6.task1;

public class Client extends Person{
    public String bankName;

    public Client(String name, String surname, String bankName){
        super(name, surname);
        this.bankName = bankName;
    }

    @Override
    void info(){
        System.out.println("Клиент: " + "Имя: " + getName() + ", Фамилия: " + getSurname() + ", Банк: " + bankName);
    }
}
