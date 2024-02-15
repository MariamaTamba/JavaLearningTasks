package Exercises;

import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Enter a number greater than 100: ");
            opcion = sc.nextInt();
            if (opcion >= 100) {
                System.out.println("The number is greater than 100");
            }
        } while (opcion >= 100);
        sc.close();
    }
}