package jc.lab9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
           
            handleEmptyStringException();  //Завдання 1
            handleCustomException(); //Завдання 2
            calculateFactorial(); //Завдання 3
            handleInputReader(); //Завдання 4
            calculateExpression(); //Завдання 5
        } catch (Exception e) {
            System.out.println("Загальна помилка: " + e.getMessage());
        }
    }

    private static void handleEmptyStringException() throws Exception {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введіть рядок: ");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                throw new Exception("Порожній рядок!");
            }

            System.out.println("Ваш рядок: " + input);
        } finally {
            System.out.println("Блок finally для завдання 1 викликається завжди.");
            scanner.close();
        }
    }

    private static void handleCustomException() {
        try {
            myExceptionMethod(null);
        } catch (MyException e) {
            System.out.println("Помилка (для завдання 2): " + e.getMessage());
        }
    }

    private static void myExceptionMethod(Object parameter) throws MyException {
        if (parameter == null) {
            throw new MyException("Параметр не може бути null");
        }
        //Ваш код тут
    }

    private static void calculateFactorial() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введіть число n для обчислення факторіалу: ");
            int n = scanner.nextInt();

            if (n < 0) {
                throw new IllegalArgumentException("Введіть не від'ємне число.");
            }

            long result = calculateFactorialValue(n);
            System.out.println("Факторіал " + n + " = " + result);
        } catch (Exception e) {
            System.out.println("Помилка для завдання 3: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static long calculateFactorialValue(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorialValue(n - 1);
        }
    }

    private static void handleInputReader() {
        try {
            int userInput = InputReader.readInt("Введіть ціле число для завдання 4: ");
            System.out.println("Ви ввели: " + userInput);
        } catch (InputMismatchException e) {
            System.out.println("Помилка введення для завдання 4: " + e.getMessage());
        }
    }

    private static void calculateExpression() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введіть значення a для обчислення виразу (завдання 5): ");
            double a = scanner.nextDouble();

            System.out.print("Введіть значення b для обчислення виразу (завдання 5): ");
            double b = scanner.nextDouble();

            double result = calculateExpressionValue(a, b);
            System.out.println("Результат виразу: " + result);
        } catch (Exception e) {
            System.out.println("Помилка введення для завдання 5: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static double calculateExpressionValue(double a, double b) {
        if (a == 0) {
            throw new IllegalArgumentException("Значення 'a' не може бути нуль.");
        }

        return b * b * (a - b) / a;
    }
}