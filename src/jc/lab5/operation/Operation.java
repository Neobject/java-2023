package jc.lab5.operation;

import jc.lab5.set.Set;

import java.util.Arrays;

public record Operation() {
    public <T> Set<T> unionSets(Set<T> first, Set<T> second) { //Об'єднання множин
        int size = first.getSet().length;

        for (T element : second.getSet()) //Знаходження кількості елементів
        {
            if (!first.contains(element)) {
                size++;
            }
        }

        T[] array = Arrays.copyOf(first.getSet(), size); //Створення кінцевої множини на основі першої
        int i = first.getSet().length;; //Індекс, з якого починається ітерація масиву для додавання елементів

        for (T element : second.getSet()) //Проводиться перевірка На наявність елементів із однієї з множин в іншій
        {
            if (!first.contains(element))
            {
                array[i] = element; //Додавання елементів з другої множини
                i++;
            }
        }

        return new Set<T>(array); //Створення екземпляра класу Set на основі створеного масиву
    }

    public <T> Set<T> intersectionSets(Set<T> first, Set<T> second) { //Перетин множин
        int size = 0;

        for (T element : second.getSet()) //Знаходження кількості елементів
        {
            if (first.contains(element)) {
                size++;
            }
        }

        T[] array = Arrays.copyOf(first.getSet(), size); //Створення кінцевої множини на основі першої
        int i = 0; //Індекс, з якого починається ітерація масиву для додавання елементів

        for (T element : second.getSet()) //Проводиться перевірка На наявність елементів із однієї з множин в іншій
        {
            if (first.contains(element))
            {
                array[i] = element; //Додавання спільних елементів
                i++;
            }
        }

        return new Set<T>(array); //Створення екземпляра класу Set на основі створеного масиву
    }

    public <T> Set<T> differanceSets(Set<T> first, Set<T> second) { //Різниця множин
        int size = first.getSet().length;

        for (T element : first.getSet()) //Знаходження кількості елементів
        {
            if (second.contains(element)) {
                size--;
            }
        }

        T[] array = Arrays.copyOf(first.getSet(), size); //Створення кінцевої множини на основі першої
        int i = 0; //Індекс, з якого починається ітерація масиву для додавання елементів

        for (T element : first.getSet()) //Проводиться перевірка На наявність елементів із однієї з множин в іншій
        {
            if (!second.contains(element))
            {
                array[i] = element; //Додавання елементів з першої множини
                i++;
            }
        }

        return new Set<T>(array); //Створення екземпляра класу Set на основі створеного масиву
    }

    public  <T> Set<T> symmetricDiffSets(Set<T> first, Set<T> second) { //Симетрична різниця множин
        return differanceSets(unionSets(first, second), intersectionSets(first, second)); //A ∆ B = (A ∪ B) - (A ∩ B)
    }
}