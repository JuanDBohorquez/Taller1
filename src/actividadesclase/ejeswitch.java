package actividadesclase;
import java.util.Scanner;

public class ejeswitch {
    public static void main(String[] args) throws Exception {

        System.out.println("ingrese el primer numero");

        double numberOne;
        double numberTwo;
        int operacion;
        double total;
        

        Scanner lectura= new  Scanner (System.in);
        
       numberOne= lectura.nextInt();

       System.out.println("ingrese el segundo numero ");


       numberTwo= lectura.nextInt();

       System.out.println("1.suma 2.resta 3.multiplicacion 4.division 5.potenciacion 6.radicacion");

       operacion= lectura.nextInt();

       switch (operacion){
        case 1:
        total=numberOne+numberTwo;
        System.out.println("la suma entre" + numberOne + "y" + numberTwo + "es" + total);
        System.out.println("la opcion seleccionada no es valida");

        break;
       

       
    
        case 2:
        total=numberOne- numberTwo;
        System.out.println("la resta entre" + numberOne + "y" + numberTwo + "es" + total);
        System.out.println("la opcion seleccionada no es valida");

        break;
       


      
        case 3:
        total=numberOne * numberTwo;
        System.out.println("la multiplicacion entre" + numberOne + "y" + numberTwo + "es" + total);
        System.out.println("la opcion seleccionada no es valida");

        break;
      


      
        case 4:
        total=numberOne/numberTwo;
        System.out.println("la dividion entre" + numberOne + "y" + numberTwo + "es" + total);
        System.out.println("la opcion seleccionada no es valida");
        break;



        case 5:
        double pot;
        pot = Math.pow(numberOne,numberTwo);
        System.out.println("escojiste la operacion de potencia");
        System.out.println("el total de la potencia es de" + pot);
        break;


        





        default:
       


  
      
        
       }
       


















       lectura.close();

    }
}       
       
