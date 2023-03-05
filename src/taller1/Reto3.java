package taller1;

import java.util.Random;
import java.util.Scanner;
public class Reto3 {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Por favor escoja 1.cara 2. Sello ");

        int eleccion;
        
        eleccion = lectura.nextInt();
        Random moneda= new Random();
        int N = 1 +  moneda.nextInt(2);
        
        if (eleccion==1 && N==1){
            System.out.println("Recuerda que 1 es cara y 2 es sello");
            System.out.println("En la moneda salio " + N + " Y tu elegiste " + eleccion);
            System.out.println("Felicidades gano");

            }else if (eleccion ==2 && N==2){
                System.out.println("Recuerda que 1 es cara y 2 es sello");
                System.out.println("En la moneda salio " + N + " Y tu elegiste " + eleccion);
                System.out.println("Felicidades gano");

                }else {
                    System.out.println("En la moneda salio " + N + " Y usted escojio " + eleccion);
                    System.out.println("Usted ha Perdido");
                    }
        
        lectura.close();
    }
    
}