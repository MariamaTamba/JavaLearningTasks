package Exercises;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce las edades para hacer la comparacion");
        System.out.println("Persona 1:");
        int person1 = sc.nextInt();
        System.out.println("Persona 2:");
        int person2 = sc.nextInt();
        System.out.println("Persona 3:");
        int person3 = sc.nextInt();

        
        if (person1 > person2 && person1 > person3) {
            System.out.println("La primera edad es la mayor.");
        } else if (person2 > person1 && person2 > person3) {
            System.out.println("La segunda edad es la mayor.");
        } else if (person3 > person1 && person3 > person2) {
            System.out.println("La tercera edad es la mayor.");
        } else {
            System.out.println("Hay dos o más edades iguales y son las mayores.");
        }



    }
    
}
