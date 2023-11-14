package Taller5;
import java.util.Scanner;
public class MayordeTres3 {
    public static void main(String[] args) {
        double n1, n2, n3;         
        Scanner teclado = new Scanner(System.in); //inicializar
        System.out.println("Ingrese los 3 numeros: ");
        n1 = teclado.nextDouble();
        n2 = teclado.nextDouble();
        n3 = teclado.nextDouble();             
        System.out.println("----La solucion al problema----");
        if (n1==n2 || n2==n3 || n1==n3)
            System.out.println("2 o mas numeros son iguales");
        else
            if (n1>n2)
                if (n1>n3)
                    System.out.println("El mayor es: " + n1);
                else
                    System.out.println("El mayor es: " + n3);
            else
                if (n2>n3)
                    System.out.println("El mayor es: " + n2);
                else
                    System.out.println("El mayor es: " + n3);                                     
        }       
    }