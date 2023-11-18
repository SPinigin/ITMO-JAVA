package ru.itmo.java.basics.lab6.task2;

public class BankEmployee extends Person implements Interface {
    public String bankName;

    public BankEmployee(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    @Override
    void info() {
        System.out.println("Работник банка: " + "Имя: " + getName() + ", Фамилия: " + getSurname() + ", Банк: " + bankName);
    }

    @Override
    public String entrance() {
        return "Для сотрудника банка доступ разрешен\n";
    }
}