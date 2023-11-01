package ru.itmo.java.basics.lab2;

public class Geolog {
    private String name;
    private String surname;
    private String gender;
    private Integer age;
    private String cityOfResidence;
    private String previousEmployment;
    private Integer expectedSalary;

    // конструктор без параметров
    public Geolog(){
    }

    // конструктор с двумя параметрами
    public Geolog(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    // конструктор с тремя параметрами
    public Geolog(String name, String surname, String gender){
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    // сеттеры и геттеры
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.name = surname;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.name = gender;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getCityOfResidence(){
        return cityOfResidence;
    }

    public void setCityOfResidence(String cityOfResidence){
        this.name = cityOfResidence;
    }

    public String getPreviousEmployment(){
        return previousEmployment;
    }

    public void setPreviousEmployment(String previousEmployment){
        this.name = previousEmployment;
    }

    public int getExpectedSalary(){
        return expectedSalary;
    }

    public void setExpectedSalary(int expectedSalary){
        this.age = expectedSalary;
    }

    // конструктор со всеми параметрами
    public Geolog(String name, String surname, String gender, Integer age, String cityOfResidence, String previousEmployment, Integer expectedSalary){
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
        this.cityOfResidence = cityOfResidence;
        this.previousEmployment = previousEmployment;
        this.expectedSalary = expectedSalary;
    }
}

