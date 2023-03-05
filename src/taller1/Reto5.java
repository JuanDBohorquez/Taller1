package taller1;
import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        String nombre;
        String apellido;
        String nombrecompleto;
    
    
        System.out.println("Ingrese nombre y apellido.");
        System.out.print("Nombre: ");
        nombre = lectura.nextLine();
        System.out.print("Apellido: ");
        apellido = lectura.nextLine();

    
    
        nombrecompleto = nombre.substring(0,2)+apellido.substring(0);

    
    
        System.out.println("el nombre completo es: " +nombrecompleto);    
        lectura.close();
      }
    }