package at.sto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Geben sie 2 Zahlen ein, die Sie addieren wollen: \n");

        Scanner scanner = new Scanner(System.in);

        int num1, num2;

        System.out.printf("Zahl 1: %n");
        num1 = scanner.nextInt();

        System.out.printf("Zahl 2: %n");
        num2 = scanner.nextInt();

        int result = num1 + num2;
        System.out.printf("Ergebnis: %d", result);
    }
}


