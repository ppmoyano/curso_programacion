package segundo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/*
- ESTE SUPUESTAMENTE YA ESTÁ, Realice un programa donde ingrese todos los nombres de un curso y al final nos muestre el nombre mas largo
- Nos muestre el nombre mas corto
- Nos muestre todos los nombres que empiezan con la letra A

*/

public class segundoB {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre = null;
        String nombreLargo= null;
        String nombreCorto= null;
        ArrayList empiezanconA = new ArrayList();

        System.out.println("Cuántos alumnos desea ingresar?");
        int cantidadAlumnos = teclado.nextInt();
        for(int i=1; i<=cantidadAlumnos; i++) {
            System.out.print("Ingresar nombre #" + i + ":");
            nombre = teclado.next();

            if(nombreLargo == null || nombre.length( ) > nombreLargo.length( )) {
                nombreLargo = nombre;
            }
            if (nombreCorto == null || nombre.length( ) < nombreCorto.length( )) {
                nombreCorto = nombre;
            }
            if (nombre.startsWith("a")) {
                empiezanconA.add(nombre);
            }
        }
        System.out.println(nombreLargo + "es el nombre mas largo");
        System.out.println(nombreCorto + "es el nombre mas corto");
        System.out.println(empiezanconA.get(0));
    } //public static void main(String[] args)
} // class Pruebas