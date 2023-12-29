package jc.lab3;

import jc.lab4.Costly;

import java.util.Objects;

public class Deposit implements Costly { //Родовище
    private String name; // Назва родовища
    private int yearOfDiscovery; // Рік відкриття
    private double costPerTon; // Собівартість тонни нафти (гривень)
    private double oilProduction; // Кількість видобутої нафти (тон)
    private final int number; //Порядковий номер
    private static int count; //Загальна кількість

    public Deposit(String name, int yearOfDiscovery, double costPerTon, double oilProduction) {
        this.name = name;
        this.yearOfDiscovery = yearOfDiscovery;
        this.costPerTon = costPerTon;
        this.oilProduction = oilProduction;
        count++;
        number = count;
    }

    public Deposit(String name) {
        this.name = name;
        count++;
        number = count;
    }

    public int getNumber() {
        return number;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfDiscovery() {
        return yearOfDiscovery;
    }

    public void setYearOfDiscovery(int yearOfDiscovery) {
        this.yearOfDiscovery = yearOfDiscovery;
    }

    public double getCostPerTon() {
        return costPerTon;
    }

    public void setCostPerTon(double costPerTon) {
        this.costPerTon = costPerTon;
    }

    public double getOilProduction() {
        return oilProduction;
    }

    public void setOilProduction(double oilProduction) {
        this.oilProduction = oilProduction;
    }

    @Override
    public String toString() {
        return "Родовище (" + number + "): " +
                "назва: '" + name + '\'' +
                ", рік відкриття:" + yearOfDiscovery +
                ", собівартість тони нафти = " + costPerTon + '₴' +
                ", кількість видобутої нафти = " + oilProduction;
    }

    public void compareTo(Deposit other) {
        System.out.println("Порівнюємо родовища " + this.name + " та " + other.name + ":");

        // Порівняння назви
        if (!Objects.equals(this.name, other.name)) {
            System.out.println("Назва: " + name + " != " + other.name);
        }

        // Порівняння року відкриття
        if (this.yearOfDiscovery != other.yearOfDiscovery) {
            System.out.println("Рік відкриття: " + this.yearOfDiscovery + " != " + other.yearOfDiscovery);
        }

        // Порівняння собівартості тонни нафти
        if (this.costPerTon != other.costPerTon) {
            System.out.println("Собівартість тонни нафти: " + this.costPerTon + " != " + other.costPerTon);
        }

        // Порівняння кількості видобутої нафти
        if (oilProduction != other.oilProduction) {
            System.out.println("Кількість видобутої нафти: " + this.oilProduction + " != " + other.oilProduction);
        }
    }

    @Override
    public double calculate() {
        return oilProduction * costPerTon;
    }
}