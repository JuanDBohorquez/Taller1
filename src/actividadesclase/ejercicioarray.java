package actividadesclase;

import java.util.Scanner;

public class ejercicioarray {

    public static void main(String[] args) {

        Scanner lectura =new Scanner(System.in);
        
        int numNotas, i;
        double  suma = 0 ,promedio;

        //Lectura del número de alumnos. Debe ser un valor positivo
        do {
            System.out.print("Número de Notas: ");
            numNotas = lectura.nextInt();
        } while (numNotas <= 0);

        //se crea un array llamado notas de numAlumn elementos de tipo double
        double[] notas = new double[numNotas]; 
        
        // Entrada de datos. Se lee la nota de cada alummo y se guarda 
        // en cada elemento del array
        for (i = 0; i < notas.length; i++) {
            System.out.println("notas " + (i + 1));
            notas[i] = lectura.nextDouble();
        }

         // Sumar todas las notas
         for (i = 0; i < notas.length; i++) {
            suma = suma + notas[i];
        }

        // Calcular la media
        promedio = suma / notas.length;

        // Mostrar la media
        System.out.printf("Nota promedio", promedio);

        // Mostrar los valores superiores a la media
        System.out.println("Listado de notas superiores a la media: ");
        for (i = 0; i < notas.length; i++) {
            if (notas[i] > promedio) {
                System.out.println("Alumno numero " + (i + 1)+ " Nota final: " + notas[i]);
            }
        }

        lectura.close ();
    
    }

}   