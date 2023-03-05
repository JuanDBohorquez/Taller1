package actividadesclase;

import java.util.Scanner;

public class practica {
    public static void   main(String[] args) {

        Scanner lectura=new Scanner(System.in);
        int budget;
        int spein;
        int seguir;
        int decrement;
        int iterador=0;

        seguir=1;
        budget=100000;
        decrement=0;
    

        while(seguir==1){ 
            System.out.println(iterador);
            //instrucciones que deseas repetir 
            System.out.println("Ingrese el valor del gasto");
            spein=lectura.nextInt();
            budget=budget-spein;
            decrement=decrement+spein;

            System.out.println("El gasto fue de " + decrement);
            System.out.println("El presupuesto es de " + budget);
            iterador++;
            if(iterador==3){
                seguir=2;
                System.out.println("Se llego al limite del presupuesto");
            }

            else if(budget==0){
                seguir=2;

                System.out.println("Se llego al limite de presupuesto");
            }

            else{
            System.out.println();
            System.out.println("desea registrar otro gasto 1. si 2. no");
            seguir=lectura.nextInt();
            }


            
        }
        lectura.close();
    }
    
}