package Taller5;
import java.util.Scanner;
public class RangoNotas7 {
    public static void main(String[] args) {
        double nota;
        System.out.println("--------Rango de Notas--------");
        Scanner teclado = new Scanner(System.in); //inicializar
        System.out.println("Ingrese su nota: ");
        nota = teclado.nextDouble();                  
        System.out.println("----La solucion al problema----");
        if ((0<=nota) && (nota<=100))   
            if (nota>=90)
            System.out.println("Su nota es A");       
            else
                if (nota>=80)
                System.out.println("Su nota es B");
                else
                    if (nota>=70)
                    System.out.println("Su nota es C"); 
                    else
                    System.out.println("Su nota es D");
        else
            System.out.println("El numero no es valido");
        }       
    }
