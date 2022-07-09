package primero;

import java.util.Arrays;
import java.util.Scanner;

public class primero {
//ESTE ANDA PERO HAY QUE DEJARLO LINDO
    public static void main(String[] args) {
        //Ejercicio 1 - Hola Mundo

        System.out.println("Hola Mundo");

        // Ejercicio 2 - Ingrese dos numeros y muestre el resultado de la suma
        System.out.println("A continuacion va a ingresar una cantidad de numeros a eleccion, luego va a recibir la suma de esos numeros");

        Scanner teclado = new Scanner(System.in);

        int sumaDeNumeros = inserteNumeros();
//esto fue lo que no me salió hacer en método.
        int i = 0;
        int ListaNumerosSuma[] = new int[sumaDeNumeros];
        for (i = 0; i < ListaNumerosSuma.length; i++) {
            System.out.println("Ingrese el número " + (i + 1));
            ListaNumerosSuma[i] = teclado.nextInt();
        }

        int suma = Arrays.stream(ListaNumerosSuma).sum(); // esto es 100% robado de internet
        System.out.println("La suma de los numeros es = " + suma);

/*
        //  Ejercicio 3 - Ingrese tres numeros y  muestre el mayor. ASÍ LO HABÍA HECHO AL PRINCIPIO
        System.out.println("Ingrese el primer número");
        int num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo número");
        int num2 = teclado.nextInt();
        System.out.println("Ingrese el tercer número");
        int num3 = teclado.nextInt();
        Pero cómo no me gusta esta forma de plantearlo, ni seguí.
        for (int= 0;)
*/

        System.out.println("Ahora va a ingresar una cierta cantidad de numeros y la respuesta va a ser el numero mayor");
        int buscarNumeroMayor = inserteNumeros();
        int listaNumerosMayores[] = new int [buscarNumeroMayor];
        int numeroMayor = listaNumerosMayores[0];


        for (i = 0; i < listaNumerosMayores.length; i++) {
            System.out.println("Ingrese el número " + (i + 1));
            listaNumerosMayores[i] = teclado.nextInt();
            if (listaNumerosMayores[i] > numeroMayor) {
                numeroMayor = listaNumerosMayores[i];
            }
        }
        System.out.println("El número mayor es " + numeroMayor);


    }

    public static int inserteNumeros() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuántos números desea ingresar?");
        int numeros = teclado.nextInt();
        return numeros;
    }
}

    /* NO PUDE HACER ANDAR ESTE, PROBÉ CON VOID, SIN VOID, CON RETURN, SIN RETURN, NO PUDE LOGRAR HACERLO ANDAR.
    public static void cargarNumeros() {
        Scanner teclado = new Scanner(System.in);
        int i = 0;
        int numeros = 0;
        //int listaNumeros [] = new int [numeros];
        for (i = 0; i > numeros; i++) {
            System.out.println("Ingrese el número " + (i + 1));
            numeros = teclado.nextInt();
        }
    }

    }

     */
