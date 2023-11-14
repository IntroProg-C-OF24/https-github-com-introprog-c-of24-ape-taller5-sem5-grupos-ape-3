package Taller5;
import java.util.Scanner;
public class AñoBisiesto5 {
    public static void main(String[] args) {
        int ano;         
        Scanner teclado = new Scanner(System.in); //inicializar
        System.out.println("Ingrese el precio del producto: ");
        ano = teclado.nextInt();                
        System.out.println("----La solucion al problema----");
        if ((ano % 4 ==0) && (ano % 100 != 0 || ano % 400 ==0))          
            System.out.println("Si es un año bisiesto ");     
        else    
            System.out.println("No es un año bisiesto ");                        
        }       
    }