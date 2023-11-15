
package com.mycompany.problema14;

import java.util.Scanner;

public class Problema14 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Hosteria de la ciudad de loja ");
        System.out.println("Ingrese el numero de dias ");
        int dia = teclado.nextInt();
        double precio = 15;
        double total = dia * precio;
        if(dia > 5){
            double descuento =total * 0.10;
            double subtotal = total /(1+(12/100));
            double pagar = subtotal + descuento;
            System.out.println("El descuento es de "+descuento);
            System.out.println("El subtotal es de "+subtotal);
            System.out.println("El total a pagar es de "+pagar);
        }else
            if(dia >10){
                double descuento = total *0.15;
                double subtotal = total /(1+(12/100));
                double pagar = subtotal + descuento;
                System.out.println("el descuento es de "+descuento);
                System.out.println("El subtotal es de "+subtotal);
                System.out.println("El total a pagar es de "+pagar);
            }else
                if(dia > 20){
                    double descuento = total* 0.2;
                    double subtotal = total /(1+(12/100));
                    double pagar = subtotal + descuento;
                    System.out.println("El descuento es de "+descuento);
                    System.out.println("El subtotal es de "+subtotal);
                    System.out.println("El total a pagar es de "+pagar);
                }else{
                    System.out.println("no hay descuento ");
                }
        
        
    }
}
