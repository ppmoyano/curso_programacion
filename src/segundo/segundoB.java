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

        String[] nombres = new String[6];
        cargarNombresEnArray(nombres);
    }

    private static void cargarNombresEnArray(String[] nombres) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Ingrese los nombres del curso ");
            nombres[i] = teclado.next();
        }

    }

    private static String calcularNombreMasLargo(String[] nombres) {
        String nombreMasLargo="";
        int mayor = nombres.length[0];
        for (int i = 0; i < nombres.length; i++) {

            if (nombres.length[i] > mayor) {
                nombreMasLargo = nombres[i];

            }
        }        return nombreMasLargo;
    }
}
//no esta terminado