package Taller5;
import java.util.Scanner;
public class CalculoIMC8 {
    public static void main(String[] args) {
        double peso;
        double altura;
        System.out.println("--------Calculo de IMC--------");
        Scanner teclado = new Scanner(System.in); //inicializar
        System.out.println("Ingrese su peso(kg): ");
        peso = teclado.nextDouble(); 
        System.out.println("Ingrese su altura(m): ");
        altura = teclado.nextDouble();      
        System.out.println("----La solucion al problema----");
        
        peso = (peso/(Math.pow(altura,2)));
        
        System.out.println("Su IMC es: " + peso);
        
        if (peso<=18)          
            System.out.println("Tiene bajo peso");      
        else
            if ((peso<25))
                System.out.println("Tiene un peso normal");
            else
                if (peso<30)
                    System.out.println("Tiene sobrepeso");
                else
                    if (peso<40)
                        System.out.println("Tiene obesidad");
                    else
                        System.out.println("Tiene obesidad severa");
        }       
    }
