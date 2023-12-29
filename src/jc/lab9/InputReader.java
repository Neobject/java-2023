package jc.lab9;

import java.util.Scanner;

class InputReader {
    public static int readInt(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }
}