
package com.mycompany.problema11;

import java.util.Scanner;

public class Problema11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Valor a cancelar de una planilla de luz");
        System.out.println("Ingrese el costo por kilovatio/hora ");
        double costo = teclado.nextDouble();
        System.out.println("Numero de kilovatios consumidos en el mes ");
        double consumo = teclado.nextDouble();
        System.out.println("Ingrese la edad ");
        int edad = teclado.nextInt();
        double total = costo * consumo;
        if(edad >= 65){
            double descuento = total * 0.9;
            System.out.println("El descuento es "+descuento);
        }else
            System.out.println("El valor a pagar es "+total);
    }
}
