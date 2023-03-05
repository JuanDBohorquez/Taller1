package actividadesclase;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);

        //Declarar el array en dos pasos 
        int [] vector1; // Declarar
        vector1=new int[10]; //Inicializar

        //Declarar el array en una sola linea
        //int [] vector2= new int [10];

        int []vector2={30,50,25,85,12,6,32,41,23,63};

        vector1[5]=6;

        System.out.println(vector1[5]);

        //

       /*  for(int p=0;p<=4;p++){
            System.out.print (vector2[p]+"");
        }*/



        //for each mejorado

        for(int dato:vector2){
            System.out.println(dato+"");
        }



        //int p=0;p<prueba2.length


        lectura.close();

    }
    
}