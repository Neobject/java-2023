package jc.lab4;

import jc.lab3.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Deposit[] deposits = new Deposit[5];

        // Морські родовища
        deposits[0] = new SeaDeposit("Чорноморське", 2000, 1200.0, 8000.0, true);
        deposits[1] = new SeaDeposit("Азовське", 2015, 1500.0, 12000.0, false);
        deposits[2] = new SeaDeposit("Каспійське", 1998, 1300.0, 10000.0, true);

        //Пустельні родовища
        deposits[3] = new DesertDeposit("Далекосхідне", 2005, 1000.0, 5000.0, 50);
        deposits[4] = new DesertDeposit("Південне", 2010, 1100.0, 6000.0, 70);

        System.out.println(Arrays.toString(deposits)); //Вивід всіх родовищ
        System.out.println(deposits[0].equals(deposits[1])); //Порівняння 2-х родовищ
        deposits[3].compareTo(deposits[4]); //Детальне порівняння 2-х родовищ

        //Отримання річних витрат на обслуговування всіх родовищ
        for (Deposit deposit : deposits) {
            System.out.println(deposit.calculate());
        }
    }
}