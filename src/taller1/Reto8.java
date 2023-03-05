package taller1;

import java.util.Random;
import java.util.Scanner;

public class Reto8 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Random lectura2 = new Random();
       
        System.out.println("Supermercado Noe:");

        int luck=1+ lectura2.nextInt(3);
        int pay=0;
        int acum=0;
        int things=0;
        int price=0;
        int totalPay=0;
        int change=0;
        System.out.println("Digite la cantidad de productos adquiridos: ");
        things=lectura.nextInt();
        for (int i = 0; i < things; i++)
        {
        System.out.println("Digite el valor de cada uno de los productos: ");
        price = lectura.nextInt();
        acum=acum+price;

        }
        System.out.println("Ingrese el valor con el que desea pagar el total de su compra: ");
        totalPay=lectura.nextInt();
        if (acum>50000) {
            switch (luck) {
                case 1:
                    System.out.println("Felicidades, sacaste una bolita roja por lo que obtienes un 10% de descuento en el valor de tu compra");
                    pay=(acum*10)/100;
                    System.out.println("El total a pagar de tu compra es: "+pay);
                    break;
                case 2:
                    System.out.println("Felicidades, sacaste una bolita azul por lo que obtienes un 30% de descuento en el valor de tu compra");
                    pay=(acum*30)/100;
                    System.out.println("El total a pagar de tu compra es: "+pay);
                break;
   
                case 3:
                System.out.println("Felicidades, sacaste una bolita amarilla por lo que obtienes un 50% de descuento en el valor de tu compra");
                    pay=(acum*50)/100;
                    System.out.println("El total a pagar de tu compra es: "+pay);
                break;
                default:
                System.out.println("Felicitaciones, sacaste la bolita blanca por lo que tu compra es totalmente GRATIS");
                    break;
            }
        } else
        {
            System.out.println("No aplica Descuento");
           
        }
        change =totalPay-acum;
        System.out.println("Su cambio es: "+change);
        lectura.close();

    }
}