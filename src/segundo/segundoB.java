package segundo;

import java.util.Scanner;
/*
- Realice un programa donde ingrese todos los nombres de un curso y al final nos muestre el nombre mas largo*/

public class segundoB {
    public static void main(String[] args) {
        String nombreLargo;
        String nombreCorto;
        String nombresConA;
        int cantidadDeNombres;
        cantidadDeNombres= largoDelArray();
        String[] nombres = new String [cantidadDeNombres];
        cargarNombresEnArray(nombres);
        nombreLargo = calcularEnElArrayElMasLargo(nombres);
        nombreCorto = calcularEnElArrayElMasCorto (nombres);
        nombresConA = calcularEnElArrayNombresConA (nombres);
}

    public static int largoDelArray() {
        int largodelArray = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Ingrese la cantidad de alumnos en el curso:");
            largodelArray = teclado.nextInt();
        }while(largodelArray < 1);
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
        int mayorCantidadDeLetras = 0;
        String nombreLargo = "";
        for (int i = 0; i < nombres.length; i++) {
            if (i == 0) { mayorCantidadDeLetras = nombres[i].length(); }
            if (nombres[i].length() > mayorCantidadDeLetras) {
                nombreLargo = nombres[i] ;}
        }
        System.out.print("El nombre mas largo es " + nombreLargo+ ".  ");
        return nombreLargo;
    }
   private static String calcularEnElArrayElMasCorto(String[] nombres) {
        int menorCantidadDeLetras = 0;
        String nombreCorto = "";
        for (int i = 0; i < nombres.length; i++) {
            if (i == 0) { menorCantidadDeLetras = nombres[i].length(); }
            if (nombres[i].length() < menorCantidadDeLetras) {
                nombreCorto = nombres[i] ;}
        }
        System.out.print("El nombre mas corto es " + nombreCorto);
        return nombreCorto;
        
    }
    private static String calcularEnElArrayNombresConA(String[] nombres) {
        char primerLetra;
        primerLetra= 'A';
        for (int i = 0; i < nombres.length; i++) {
           if (nombres[i].charAt(0) == primerLetra)
           { System.out.print(" Los nombres comenzados con A son :" + nombres[i]);}
    }
return "";
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