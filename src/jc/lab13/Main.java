package jc.lab13;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[] {
                new Book("Парадокси Космосу"),
                new Book("Квантова електродинаміка"),
                new Book("Експериментальна історія часу"),
                new Book("Теорія великого вибуху"),
                new Book("Енциклопедія невідомого"),
                new Book("Теорія фазового переходу")
        };

        System.out.println(Arrays.toString(Arrays.stream(books).map(Book::getTitle).sorted().toArray()));
    }
}