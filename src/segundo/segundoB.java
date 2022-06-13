package segundo;

import java.util.Scanner;
/*
- Realice un programa donde ingrese todos los nombres de un curso y al final nos muestre el nombre mas largo
- Nos muestre el nombre mas corto
- Nos muestre todos los nombres que empiezan con la letra A
 */
public class segundoB {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cargarNombres;
        String nombreMasLargo;
        String[] nombres = new String[6];
        String nombreMasCorto;
        String nombresConA;

        cargarNombresEnArray(nombres);
        nombreMasLargo = calcularEnElArrayElMasLargo(nombres);
        nombreMasCorto = calcularEnArrayElMasCorto(nombres);
        nombresConA = calcularEnArrayNombresConA(nombres);
        System.out.println("El nombre mas largo es: " + nombreMasLargo);
        System.out.println("El nombre mas corto es: " + nombreMasCorto);

    }

    private static String calcularEnArrayNombresConA(String[] nombres) {

        char empiezaConA;
        empiezaConA = "A";
        System.out.println("Los nombres con A son: " );
        for ( int i =0; i< nombres.length; i++) {
            if (nombres[i].charAt(0) == empiezaConA) {
                System.out.println(nombres[i]);
            }
        } //NO SALE



    }


    private static String calcularEnArrayElMasCorto(String[] nombres) {
          String nombreMasCorto="";
          int menor = nombres[0].length();
          for (int i=0; i < nombres.length; i++) {
              if (nombres[i].length() < menor) {
                   nombreMasCorto = nombres[i];
              }
          }
        return nombreMasCorto;
    }

    private static String calcularEnElArrayElMasLargo(String[] nombres) {
        String nombreMasLargo="";
        int mayor = nombres[0].length();
        for (int i = 0; i < nombres.length; i++) {

            if (nombres[i].length() > mayor) {
                nombreMasLargo = nombres[i];
            }
        }        return nombreMasLargo;
    }

    private static void cargarNombresEnArray(String[] nombres) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Ingrese los nombres del curso ");
            nombres[i] = teclado.next();
        }


    }
}
