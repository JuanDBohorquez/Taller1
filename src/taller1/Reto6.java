package taller1;

import java.util.Random;
import java.util.Scanner;

public class Reto6 {

    public static void main(String[] args) {
        Random craps = new Random();
        Scanner lectura = new Scanner(System.in);

        boolean jugar = true;
        while (jugar) {
            System.out.println("Empiezas con un puntaje de 0, si ganas obtendrás un puntaje de 100");
            int resultado = 0;
            int crap1 = craps.nextInt(6) + 1;
            int crap2 = craps.nextInt(6) + 1;
            int total = crap1 + crap2;
            System.out.println("El primer dado tuvo: " + crap1 + " en el segundo dado, un total de: " + crap2);
            System.out.println("Con un total de: " + total);
            if (crap1==1 && crap2==1) {
                System.out.println("Haz ganado! Felicidades");
                resultado = resultado + 100;
                System.out.println("Obtuviste un puntaje total de: " + resultado);
            } else if (total==3 || total==11 || total==2) {
                System.out.println("Haz ganado! Felicidades");
                resultado = resultado + 100;
                System.out.println("Obtuviste un puntaje total de: " + resultado);
            }else if (total==7 || total==12) {
                System.out.println("Haz ganado! Felicidades");
                resultado = resultado + 100;
                System.out.println("Obtuviste un puntaje total de: " + resultado);
            } else {
                System.out.println("Perdiste");
                System.out.println("Obtuviste un puntaje total de: " + resultado);
            }
            System.out.println("Deseas jugar nuevamente? Presiona si para continuar");
            String respuesta = lectura.nextLine();
            jugar = respuesta.equals("si");    
        }
        System.out.println("Adiós!!!");
        lectura.close();
    }
}
    