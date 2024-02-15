package Exercises;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate the factorial");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Cannot calculate the factorial of a negative number");
            
        }else{
            int factorial = 1;
            int counter = 1;


            while (counter <= number) {
                factorial *= counter;
                counter++;
                
            }
            System.out.println("The factorial of " + number + " is: " + factorial);


        


        }
    }
    
}
