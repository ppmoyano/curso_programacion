package segundo;

import java.util.Scanner;
/*
- Realice un programa donde ingrese todos los nombres de un curso y al final nos muestre el nombre mas largo*/

public class segundoB {
    public static void main(String[] args) {
        String nombreLargo;

        int cantidadDeNombres;
        cantidadDeNombres = largoDelArray();
        String[] nombres = new String[cantidadDeNombres];
        cargarNombresEnArray(nombres);
        nombreLargo = calcularEnElArrayElMasLargo(nombres);
        System.out.println("El nombre mas largo es : " + nombreLargo);
        System.out.println("El nombre mas corto es : " + calcularEnElArrayElMasCorto(nombres));
        calcularEnElArrayNombresConA(nombres);
    }

    public static int largoDelArray() {
        int largodelArray = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Ingrese la cantidad de alumnos en el curso:");
            largodelArray = teclado.nextInt();
        } while (largodelArray < 1);
        return largodelArray;
    }

    private static void cargarNombresEnArray(String[] nombres) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Ingrese el nombre " + i);
            nombres[i] = teclado.nextLine();
        }

    }

    private static String calcularEnElArrayElMasLargo(String[] nombres) {
        int mayorCantidadDeLetras = nombres[0].length();
        String nombreLargo = "";
        nombreLargo = nombres[0];
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].length() > mayorCantidadDeLetras) {
                nombreLargo = nombres[i];
            }
        }
        return nombreLargo;
    }

    private static String calcularEnElArrayElMasCorto(String[] nombres) {
        int menorCantidadDeLetras = nombres[0].length();
        String nombreCorto = "";
        nombreCorto = nombres[0];
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].length() < menorCantidadDeLetras) {
                nombreCorto = nombres[i];
            }
        }
        return nombreCorto;

    }

    private static void calcularEnElArrayNombresConA(String[] nombres) {
        char primerLetra;
        primerLetra = 'A';
        System.out.println("Los nombres comenzados con A son :");
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].charAt(0) == primerLetra) {
                System.out.println (nombres[i]);
            }
        }

    }

}


/*- Nos muestre el nombre mas corto
- Nos muestre todos los nombres que empiezan con la letra A
 */
/*public class segundoB {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

    }
}
*/