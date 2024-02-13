package Exercises;

import java.util.Scanner;

public class CalculatePrice {

    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
       
        System.out.println("Introduce la cantidad del precio");
        int product = sc.nextInt();
        System.out.println("Introduce el precio del producto");
        int price = sc.nextInt();

        double total = product * price;
        sc.nextLine();
        System.out.println(total);

        if (total > 500) {
            System.out.println("Te vamos a aplicar un descuento de 20% !!!");
            double totalImport = total / 0.2;
            System.out.println("El importe total queda a " + totalImport );
            
        } else if(total > 1000){
            System.out.println("Te vamos a aplicar un descuento de 40% !!! Porque tu compra ha superado a 1000€");
            double totalImport = total * 0.4;
            System.out.println("El importe total queda a " + totalImport + "€");

        }
          sc.close();
    }
    
}