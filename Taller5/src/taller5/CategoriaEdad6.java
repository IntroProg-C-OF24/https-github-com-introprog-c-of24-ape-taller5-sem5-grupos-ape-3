package Taller5;
import java.util.Scanner;
public class CategoriaEdad6 {
    public static void main(String[] args) {
        int edad;         
        Scanner teclado = new Scanner(System.in); //inicializar
        System.out.println("Ingrese el precio del producto: ");
        edad = teclado.nextInt();                  
        System.out.println("----La solucion al problema----");
        if ((edad>=0) && (edad<=12))          
            System.out.println("Es un niño");      
        else
            if ((edad>12) && (edad<18))
                System.out.println("Es un adolecente");
            else
                System.out.println("Es un adulto");                                                                        
        }       
    }