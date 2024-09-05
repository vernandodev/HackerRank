package org.example;

import java.util.Scanner;

public class JavaLoops1 {
   private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scanner.nextInt();
        for(int i=0; i<=10; i++) {
            int result = N*i;
            System.out.println(N + " x " + i + " = " + result);
        }
    }
}
