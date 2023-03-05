package taller1;

import java.util.Scanner;
public class Reto2 {
    public static void main(String[] args) {

        int pesobb=0;
        int mesesbb=0;
        int dosis=0;
        
        try (Scanner lectura = new Scanner(System.in)){
            System.out.println("Ingrese el peso del bebé: ");
            pesobb = lectura.nextInt();
            System.out.println("Ingrese la edad del bebé (meses): ");
            mesesbb = lectura.nextInt();
            dosis = ((mesesbb*10)/(pesobb+10) * 8);
            System.out.println("La dosis adecuada es: " + dosis);

        }
    }
    
}