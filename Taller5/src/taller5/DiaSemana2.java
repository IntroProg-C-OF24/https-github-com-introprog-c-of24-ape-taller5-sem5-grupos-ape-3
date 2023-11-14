package Taller5;
import java.util.Scanner;
public class DiaSemana2 {
    public static void main(String[] args) {
        int Dia;
         
        Scanner teclado = new Scanner(System.in); //inicializar
        System.out.println("Ingrese un numero: ");
        Dia = teclado.nextInt();
               
        System.out.println("----La solucion al problema----");
        
        switch (Dia) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
        }         
            
            
        }
        
    }
