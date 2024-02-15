package Exercises;

import java.util.Scanner;

public class Medicines {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el peso del paciente");
        double peso = sc.nextDouble();


         // Verificar qué medicamento debe tomar el paciente
         if (peso < 50) {
            System.out.println("El paciente debe tomar 2 tabletas de Medicamento A.");
        } 
        if (peso >= 50 && peso < 60) {
            System.out.println("El paciente debe tomar 3 tabletas de Medicamento B.");
        }
        if (peso >= 60 && peso < 70) {
            System.out.println("El paciente debe tomar 3 tabletas de Medicamento B.");
        }
        if (peso >= 70 && peso < 80) {
            System.out.println("El paciente debe tomar 4 tabletas de Medicamento C.");
        }
        if (peso >= 80) {
            System.out.println("El paciente debe tomar 4 tabletas de Medicamento C.");
        }

    }
    
}
