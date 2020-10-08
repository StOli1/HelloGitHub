package at.sto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Geben sie 2 Zahlen ein, die Sie addieren wollen: \n");

        Scanner scanner = new Scanner(System.in);

        double num1, num2;

        System.out.printf("Zahl 1: %n");
        num1 = scanner.nextDouble();

        System.out.printf("Zahl 2: %n");
        num2 = scanner.nextDouble();

        double result = num1 + num2;
        System.out.printf("Ergebnis: %f,12", result);
    }
}


