package taller1;

import java.util.Scanner;
public class Reto1 {
    public static void main(String[] args) {
        double gradosF=0;
        double gradosC=0; 
        try (Scanner lectura = new Scanner (System.in)){
        System.out.println("Ingrese la temperatura fahrentheit: ");
        gradosF = lectura.nextDouble();
        gradosC = ((gradosF - 32) / 1.8);
        System.out.println("En grados centigrados esto es: "+ gradosC);

        }
    }
    
}