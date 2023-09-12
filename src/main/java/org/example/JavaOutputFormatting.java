package org.example;

import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) {
        System.out.println("================================");
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<3; i++) {
            String string = scanner.next();
            int x = scanner.nextInt();
            System.out.printf("%-14s %03d\n", string, x);
        }
        System.out.println("================================");
    }
}
