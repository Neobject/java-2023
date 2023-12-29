package jc.lab5;

import jc.lab5.operation.Operation;
import jc.lab5.set.Set;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        execute(new Set<>(new Integer[] {1, 3, 5, 7, 9}), new Set<>(new Integer[] {1, 2, 3, 5, 7}));
        execute(new Set<>(new String[] {"a", "b", "c" }), new Set<>(new String[] { "b", "c", "d", "e" }));
    }

    private static <T> void execute(Set<T> first, Set<T> second) { //Всі дії з множинами
        Operation operation = new Operation();

        //Вивід множина
        System.out.println("A" + Arrays.toString(first.getSet()));
        System.out.println("B" + Arrays.toString(second.getSet()));

        //Вивід результатів операцій
        System.out.println("A ∪ B " + Arrays.toString(operation.unionSets(first, second).getSet()));
        System.out.println("A ∩ B " + Arrays.toString(operation.intersectionSets(first, second).getSet()));
        System.out.println("A \\ B " + Arrays.toString(operation.differanceSets(first, second).getSet()));
        System.out.println("B \\ A " + Arrays.toString(operation.differanceSets(second, first).getSet()));
        System.out.println("A △ B " + Arrays.toString(operation.symmetricDiffSets(first, second).getSet()));
    }
}