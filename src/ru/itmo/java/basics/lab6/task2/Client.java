package ru.itmo.java.basics.lab6.task2;

public class Client extends Person implements Interface {
    public String bankName;

    public Client(String name, String surname, String bankName){
        super(name, surname);
        this.bankName = bankName;
    }

    @Override
    void info(){
        System.out.println("Клиент: " + "Имя: " + getName() + ", Фамилия: " + getSurname() + ", Банк: " + bankName);
    }

    @Override
    public String entrance(){
        return "Для клиента банка доступ запрещен\n";
    }
}