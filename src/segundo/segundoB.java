package segundo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/*
ESTE SUPUESTAMENTE YA ESTÁ, TENGO QUE DEJARLO LINDO NADA MÁS
FALLA SI PONGO SÓLO NOMBRES CON A Y NO ME DA LA CABEZA PARA ENTENDER PORQUE
- Realice un programa donde ingrese todos los nombres de un curso y al final nos muestre el nombre mas largo
- Nos muestre el nombre mas corto
- Nos muestre todos los nombres que empiezan con la letra A

*/

public class segundoB {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre = null;
        String nombreLargo = null;
        String nombreCorto = null;
        String nombreConA = null;
        int cantidadAlumnos = 0;
        int x = 0;
        System.out.println("Cuántos alumnos desea ingresar?");
        cantidadAlumnos = teclado.nextInt();
        String[] empiezanconA = new String[0];
        empiezanconA = new String[cantidadAlumnos];
        for (int i = 1; i <= cantidadAlumnos; i++) {
            System.out.print("Ingresar nombre #" + i + ":");
            nombre = teclado.next();

            if (nombreLargo == null || nombre.length() > nombreLargo.length()) {
                nombreLargo = nombre;
            }
            if (nombreCorto == null || nombre.length() < nombreCorto.length()) {
                nombreCorto = nombre;
            }
            if (nombre.startsWith("a") || nombre.startsWith("A")) {
                empiezanconA[i] = nombre;
            }
        }
        System.out.println(nombreLargo + " es el nombre mas largo");
        System.out.println(nombreCorto + " es el nombre mas corto");

        System.out.println("Los nombres con A son: ");
        for  (x=1; x<empiezanconA.length; x++)
            if (empiezanconA[x] != null) {
                System.out.println(empiezanconA[x]);
            }

//
        //      do {
        //        System.out.println(empiezanconA[i]);
        //  }
    } //public static void main(String[] args)
} // class segundoB