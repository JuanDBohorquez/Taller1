package taller1;

import java.util.Random;
import java.util.Scanner;

public class Reto7 {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int bolita;
        double cantidadpagar, descuento, importecompra;
        Random rand = new Random();
        System.out.print("Ingresa el valor de importe de la compra: ");
        importecompra = lectura.nextDouble();
        lectura.nextLine();
        descuento=0;
        bolita=rand.nextInt(5);
        
        if(bolita==1 && importecompra>50000)
        {
            descuento=importecompra*0.1;
            System.out.println("Bolita Roja.");
        }
        else if(bolita==2 && importecompra>50000)
        {
            descuento=importecompra*0.3;
            System.out.println("Bolita Azul.");
        }
        else if(bolita==3 && importecompra>50000)
        {
            descuento=importecompra*0.5;
            System.out.println("Bolita Amarilla.");
        }
        else if(bolita==4 && importecompra>50000)
        {
            descuento=importecompra;
            System.out.println("Bolita Blanca.");
        }

        else{
            System.out.println("No Aplica Descuento");
        }
        
        cantidadpagar=importecompra-descuento;
        System.out.println("Valor de bolita: " + bolita);
        System.out.println("Valor de cantidad a pagar: " + cantidadpagar);
        System.out.println("Valor de descuento: " + descuento);
        
        lectura.close();
    }

}