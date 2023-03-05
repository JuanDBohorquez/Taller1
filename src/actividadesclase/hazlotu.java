package actividadesclase;

import java.util.Scanner;

public class hazlotu {
    public static void main(String[] args) {
        
        Scanner lectura= new  Scanner (System.in);
   
    double nota1, nota2, nota3,nota4;
    double def;
   
    
   
    
        System.out.println("Por favor ingrese las notas del estudiante");
        System.out.print("Ingrese nota 1: ");
        nota1 = lectura.nextDouble();
        System.out.print("Ingrese nota 2: ");
        nota2 = lectura.nextDouble();
        System.out.print("Ingrese nota 3: ");
        nota3 = lectura.nextDouble();
        System.out.print("Ingrese nota 4: ");
        nota4 = lectura.nextDouble();
    
    
   
    
        def = (nota1+nota2+nota3+nota4)/4;

    
   
    
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Nota definitiva: " + def);
    
   
    
        if(def > 4.0) {
            System.out.println("El estudiante aprueba con Buenos Resultados");
        }
        else {
            if(def >= 3.0 && def <=4.0) {
                System.out.println("El estudiante paso Raspando la Asignatura");
            }
            else {
                if(def >= 0.0 && def <=2.9) {
                    System.out.println("El estudiante reprueba");
                }
                else {
                    System.out.println("Error en las notas ingresadas");
                }
            }
        }


        lectura.close();
    }
 
}