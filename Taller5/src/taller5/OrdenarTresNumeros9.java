package Taller5;
import java.util.Scanner;
public class OrdenarTresNumeros9 {
    public static void main(String[] args) {
        int n1,n2,n3;
        
        System.out.println("--------Ordenar los numeros--------");
        Scanner teclado = new Scanner(System.in); //inicializar
        System.out.println("Ingrese 3 numeros: ");
        n1 = teclado.nextInt();
        n2 = teclado.nextInt();   
        n3 = teclado.nextInt();       
        System.out.println("----La solucion al problema----");             
        
        if ((n1>n2)&&(n1>n3))          
            if (n3>n2)
                System.out.println(n1 + ", " + n3 + ", " + n2);
            else
                System.out.println(n1 + ", " + n2 + ", " + n3);
        else
            if ((n2>n1)&&(n2>n3))
                if (n1<n3)
                    System.out.println(n2 + ", " + n3 + ", " + n1);
                else 
                    System.out.println(n2 + ", " + n1 + ", " + n3);
            else
                if (n1<n2)
                    System.out.println(n3 + ", " + n2 + ", " + n1);
                else
                    System.out.println(n3 + ", " + n1 + ", " + n2);
        }       
    }
