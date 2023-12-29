package jc.lab10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        ArrayList<Sportsman> sportsmen = new ArrayList<>(Arrays.asList( //Спортсмени
                new Sportsman("Олександр", "Мельник", 182, 77),
                new Sportsman("Іван", "Петренко", 185, 85),
                new Sportsman("Петро", "Хоменко", 170, 68),
                new Sportsman("Володимир", "Ільєнко", 181, 82),
                new Sportsman("Сергій", "Стерненко", 177, 85)
        ));

        System.out.println(getLastNames(sportsmen)); //Вивід списку прізвищ спортсменів

        //Вивід всіх спортсменів зі зростом не менше 1м 80см та вагою не менше 80кг
        SportsmanFilter filter = sportsman -> sportsman.getHeight() >= 180 && sportsman.getWeight() >= 80;

        for (Sportsman sportsman : sportsmen) {
            if (filter.test(sportsman)) {
                System.out.println(sportsman.getFirstName() + " " + sportsman.getLastName());
            }
        }
    }

    public static ArrayList<String> getLastNames(ArrayList<Sportsman> sportsmen) { //Перетворення спису спортсменів на список їх прізвищ
        ArrayList<String> lastNames = new ArrayList<>();
        Function<Sportsman, String> getLastName = Sportsman::getLastName;

        for (Sportsman sportsman : sportsmen) {
            lastNames.add(getLastName.apply(sportsman));
        }

        return lastNames;
    }
}