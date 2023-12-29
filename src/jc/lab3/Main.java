package jc.lab3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Екземпляр через конструктори
        Deposit east = new Deposit("Східне", 1990, 1200.0, 8000.0);

        //Екземпляр через сетери
        Deposit south = new Deposit("Південне");
        south.setYearOfDiscovery(2003);
        south.setCostPerTon(1500.0);
        south.setOilProduction(12000.0);

        //Екземпляр через сетери з вводом із консолі
        Deposit west = new Deposit("Західне");
        Scanner scan = new Scanner(System.in);

        System.out.println("Рік відкриття:");
        west.setYearOfDiscovery(scan.nextInt());
        System.out.println("Собівартість тони нафти:");
        west.setCostPerTon(scan.nextInt());
        System.out.println("Кількість видобутої нафти:");
        west.setOilProduction(scan.nextInt());

        //Вивід
        System.out.println(east);
        System.out.println(south);
        System.out.println(west);
    }
}