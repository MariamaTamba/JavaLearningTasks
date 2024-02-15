package Exercises;

import java.util.Scanner;

public class NumDaysMonthYear {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numDiesMesAny = 0;

        System.out.println("Enter the year:");
        int any = teclado.nextInt();

        System.out.println("Enter the month (1-12):");
        int mes = teclado.nextInt();

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            numDiesMesAny = 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            numDiesMesAny = 30;
        } else if (mes == 2) {
   

            if ((any % 4 == 0 && any % 100 != 0) || any % 400 == 0) {
                numDiesMesAny = 29;
            } else {
                numDiesMesAny = 28;
            }
        } else {
            System.out.println("Month entered is not valid.");
        }

        System.out.println("The number of days in the month " + mes + " of year " + any + " is: " + numDiesMesAny);
        teclado.close();
    }
}