package taller1;
import java.util.Scanner;

public class Reto9 {
    public static void main(String args[]){
        try(Scanner lectura = new Scanner(System.in)){
            int select = (int)(Math.random() * 2) + 1;
            int opcion,contador=0,jg=1,aps=1;
        for (jg=1;jg<3;jg++){
            System.out.println("Igrese la cantidad que desea apostar si hasta ahora empieza, si ya jugó, coloque la cantidad con la que terminó la ronda pasada: ");
            aps=lectura.nextInt();
            System.out.println("Si elije Cara digite 1 ");
            System.out.println("Si elije Sello digite 2 ");
            opcion= lectura.nextInt();
    
            System.out.println("La computadora ya elijio ");
            switch ( select ){
                case 1:
                    System.out.println("Cara");
                    switch ( opcion ){
                        case 1: System.out.println("Usted gana "+(aps+50)); 
                        break;
                        case 2: System.out.println("Usted Pierde "+(aps-50)); 
                        break;
                    }
                case 2:
                    System.out.println("Sello");
                    switch ( opcion ){
                        case 1: System.out.println("Usted Pierde "+(aps-50)); 
                        break;
                        case 2: System.out.println("Usted gana "+(aps+50)); 
                        break;

                }
                System.out.println("Desea volver a jugar?(1 para si, 2 para no) ");
                jg=lectura.nextInt();
                contador=contador+1;

        }
        }
        System.out.println("Usted jugó una cantidad de: "+contador+" veces");
        System.out.println("Usted terminó con un total de: "+aps+" puntos");
        }
    }
}
    