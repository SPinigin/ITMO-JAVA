package ru.itmo.java.basics.lab3.task3;

import java.time.Year;

public class House {
    private Integer floors;
    private Integer byear;
    private String name;

    public void Set(Integer floors, Integer byear, String name) {
        this.floors = floors;
        this.byear = byear;
        this.name = name;
    }

    @Override
    public String toString() {
        return "House{" +
                "floors=" + floors +
                ", byear=" + byear +
                ", name='" + name + '\'' +
                '}';
    }

    private int getAge() {
        return Year.now().getValue() - byear;
    }

    public String houseAge() {

        return toString() + " Количество лет с момента постройки: " + getAge();
    }
}
