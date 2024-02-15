package Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Aparcamiento {
    static String[][] aparcamiento = new String[9][10];
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion = 0;
        do {
            System.out.println("Salir");
            System.out.println("Insertar");
            System.out.println("Buscar");
            System.out.println("Eliminar");
            System.out.println("Buscar");
            System.out.println("Introduce la Opcion:");
            opcion= teclado.nextInt();

            switch (opcion) {
                case 1:
                    insertar();
                    break;

                case 2:
                    buscar();
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

            }

        } while (opcion != 0);

    }

    private static void insertar() {
        System.out.println("Introduce la placa de la matricula");
        String matricula = teclado.next();
    
        for (int i = 0; i < aparcamiento.length; i++) {
            for (int j = 0; j < aparcamiento[i].length; j++) {
                aparcamiento[i][j] = "0";
            }
        }
    
       
        int fila;
        int columna;
        do {
            System.out.println("Introduce el numero de filas del aparcamiento");
            fila = teclado.nextInt();
            System.out.println("Introduce el numero de colunas del aparcamiento");
            columna = teclado.nextInt();
    
            if (fila > 1 || fila > aparcamiento.length || columna <1 || columna > aparcamiento[0].length) {
                System.out.println("¡Error! La columna o la fila estan fuera de rango");
                continue; 
            }
    
            if (aparcamiento[fila - 1][columna -1] !=null) {
                System.err.println("Error el aparcameinto sellecionado ya esta ocupado");
            }
    
          
            aparcamiento[fila -1][columna -1] = matricula;
    
           
            mostrarAparcameinto();
    
        } while (fila > 1 || fila > aparcamiento.length || columna <1 || columna > aparcamiento[0].length);
    }

    private static void mostrarAparcameinto() {
        for (int i = 0; i < aparcamiento.length; i++) {
            System.err.println(Arrays.toString(aparcamiento[i]));
        }
    }


    private static void buscar() {
        
    }

   
}
