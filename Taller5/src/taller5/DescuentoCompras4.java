package Taller5;
import java.util.Scanner;
public class DescuentoCompras4 {
    public static void main(String[] args) {
        double precio;         
        Scanner teclado = new Scanner(System.in); //inicializar
        System.out.println("Ingrese el precio del producto: ");
        precio = teclado.nextDouble();
                  
        System.out.println("----La solucion al problema----");
        if (precio>100){
            precio=(precio-(precio*10/100));
            System.out.println("Precio final con descuento: " + precio);
            
        }else
            System.out.println("Precio final: " + precio);
                                                
        }       
    }
