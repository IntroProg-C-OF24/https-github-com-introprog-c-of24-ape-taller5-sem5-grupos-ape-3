
package com.mycompany.problema13;

import java.util.Scanner;

public class Problema13 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Datos de un automovil");
        System.out.println("Ingrese la marca");
        String marca = teclado.nextLine();
        System.out.println("Ingrese el origen:ALEMANIA , JAPON , ITALIA , USA ");
        String origen = teclado.nextLine();
        System.out.println("Ingrese el costo ");
        double costo = teclado.nextDouble();
        if(origen.toUpperCase().equals("ALEMANIA")){
            double impuesto = costo * 0.2;
            double costo_total=costo+impuesto;
            System.out.println("El impuesto es de "+impuesto);
            System.out.println("El costo total con impuestos es"+costo_total);
        }else
            if(origen.toUpperCase().equals("JAPON")){
                double impuesto = costo * 0.3;
                double costo_total=costo+impuesto;
                System.out.println("El impuesto es de "+impuesto);
                System.out.println("El costo total con impuestos es "+costo_total);                
            }else
                if(origen.toUpperCase().equals("ITALIA")){
                    double impuesto = costo * 0.15;
                    double costo_total=costo+impuesto;
                    System.out.println("El impuesto es de "+impuesto);
                    System.out.println("El costo total con impuestos es "+costo_total);
                }else
                    if(origen.toUpperCase().equals("USA")){
                        double impuesto = costo * 0.08;
                        double costo_total=costo+impuesto;
                        System.out.println("El impuesto es de "+impuesto);
                        System.out.println("El costo total con impuestos es "+costo_total);
                        
                    }else{
                        System.out.println("Origen desconocido ");
                    }
                        
    }
}
