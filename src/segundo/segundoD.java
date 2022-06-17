package segundo;

import java.util.Objects;
import java.util.Scanner;

/*
- Realice un programa que ingrese dos nombres, si los nombres y despues diga el nombre X es mas largo que el nombre Y, o el nombre X es mas corto que el nombre Y
 o el nombre X y Y tienen el mismo largo.
 Si el nombre X es igual al nombre Y muestre un mensaje no puede ingresar dos veces el mismo nombre.


public class segundoD {
    public static void main(String[] args) {

        String nombreA = ingresarNombre();
        String nombreB = ingresarNombre();

        compararLosNombres(nombreA,nombreB);

    }

    private static void compararLosNombres(String nombreA, String nombreB) {

        if (Objects.equals(nombreA, nombreB)) {
            System.out.println("No puede ingresar dos nombres iguales");}

            else  if (nombreA.length()>nombreB.length()) {
                System.out.println(nombreA + " es mas largo que "+nombreB);}
                else if ( nombreA.length() < nombreB.length()) {
                    System.out.println(nombreA + " es mas corto que " + nombreB);
                }
                else  if (nombreA.length()==nombreB.length()) {
                    System.out.println(nombreA+" y " + nombreB+" tienen el mismo largo" );
                }
        }




        /*
    Agregar logica para comparar los nombres
    Hay 4 posible mensajes.




    private static String ingresarNombre() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un nombre");

        return teclado.nextLine();
    }/*
        Agregar logica para ingresar nombre

}

/*
Ejemplo de ejecucion 1:
        Ingrese un nombre:
        Lautaro
        Ingrese nombre:
        Maria

        Lautaro es mas largo que Maria.

Ejemplo de ejecucion 2:
        Ingrese un nombre:
        Pepe
        Ingrese nombre:
        Karen

        Pepe es mas corto que Karen.

Ejemplo de ejecucion 3:
        Ingrese un nombre:
        Pepe
        Ingrese nombre:
        Pato

        Pepe y Pato tienen el mismo largo

Ejemplo de ejecucion 4:
        Ingrese un nombre:
        Pepe
        Ingrese nombre:
        Pepe

        No puede ingresar dos veces el mismo nombre


 */
