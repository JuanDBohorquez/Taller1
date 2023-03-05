package actividadesclase;

import java.util.Scanner;

public class ejercicio {

         public static void main(String[] args) {
 
         Scanner lectura=new Scanner(System.in);
         int alum,x=0,hom=0,muj=0,opc=0;
 
    System.out.println("Cuantos personas desea ingresar: ");
    alum=lectura.nextInt();
 
       while(x<alum){
             System.out.println("¿Eres Hombre o mujer?");
             System.out.println("1: Hombre"
                     + "\n2: Mujer"
                     + "\nElige una opcion");
             opc=lectura.nextInt();
             switch(opc){
                case 1:
                    System.out.println("Hombre");
                    hom=hom+1;
                    x++;
                    break;
                case 2:
                    System.out.println("Mujer");
                    muj=muj+1;
                    x++;
                    break;
                default:
                   System.out.println("Esa opcion no existe");
                   alum=alum-1;
                   x--;
           }
        }
       System.out.println("Total de Hombres en el salon: "+hom);
       System.out.println("Total de Mujeres en el salon: "+muj);

       lectura.close();
    }
}