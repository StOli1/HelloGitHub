package at.sto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2;
        for (int i = 0; i < 1000; i++) {
            try {
                System.out.println("Geben sie 2 Zahlen ein, die Sie addieren wollen: \n");
                System.out.printf("Zahl 1: %n");
                num1 = scanner.nextInt();

                System.out.printf("Zahl 2: %n");
                num2 = scanner.nextInt();

                int result = num1 + num2;
                System.out.printf("Ergebnis: %d%n", result);
            } catch (Exception e) {
                System.out.println("Die Eingabe ist Fehlerhaft");
            }
        }
    }
}


