package jc.lab6;

import jc.lab3.Deposit;
import jc.lab4.DesertDeposit;
import jc.lab4.SeaDeposit;

import java.util.PriorityQueue;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        //PriorityQue
        PriorityQueue<Integer> queue = new PriorityQueue<>(); //Створення
        System.out.println(queue);

        //Додавання елементів
        queue.add(14000);
        queue.add(22000);
        queue.add(15000);
        queue.add(7000);
        queue.add(10000);
        System.out.println(queue);

        //Видалення елементів
        queue.remove();
        queue.remove();
        queue.remove();
        System.out.println(queue);

        //TreeMap
        TreeMap<Integer, Deposit> map = new TreeMap<>(); //Створення
        System.out.println(map);

        map.put(8000, new SeaDeposit("Чорноморське", 2000, 1200.0, 8000.0, true));
        map.put(12000, new SeaDeposit("Азовське", 2015, 1500.0, 12000.0, false));
        map.put(10000, new SeaDeposit("Каспійське", 1998, 1300.0, 10000.0, true));
        map.put(5000, new DesertDeposit("Далекосхідне", 2005, 1000.0, 5000.0, 50));
        map.put(6000, new DesertDeposit("Південне", 2010, 1100.0, 6000.0, 70));
        //Додавання елементів

        System.out.println(map);
        //Видалення елементів
        map.remove(12000);
        map.remove(8000);
        map.remove(6000);
        System.out.println(map);

        //Редагування атрибутів елементів
        map.get(5000).setOilProduction(15000);
        System.out.println(map);
    }
}