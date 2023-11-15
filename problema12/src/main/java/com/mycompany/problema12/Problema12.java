
package com.mycompany.problema12;

import java.util.Scanner;

public class Problema12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Costo de un pedido ");
        System.out.println("Ingrese la cantidad que se requiere ");
        int cantidad = teclado.nextInt();
        System.out.println("Ingrese el precio unitario");
        double precio = teclado.nextDouble();
        double total = cantidad * precio;
        if(cantidad > 50){
            double descuento = total * 0.85;
            System.out.println("Su costo con descuento es"+descuento);
        }else
            System.out.println("El costo a pagar es de "+total);
    }
}
