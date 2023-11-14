package Taller5;
import java.util.Scanner;
public class EdadParaVotar1 {
    public static void main(String[] args) {
        int edad;
         
        Scanner teclado = new Scanner(System.in); //inicializar
        System.out.println("Ingrese su edad: ");
        edad = teclado.nextInt();
               
        System.out.println("----La solucion al problema----");
        
        if (edad>=18)
            System.out.println("Usted es elegible para votar");
     
        else
            System.out.println("Usted no es elegible para votar");
        
    }
}