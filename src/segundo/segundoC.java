package segundo;

import java.util.Scanner;

/*
- Realice un programa donde ingrese X numeros, muestre el promedio, y cual  el numero mas ingresado y cuantas veces se ingreso
 */
public class segundoC {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int cantidadDeNumeros = definirCantidadDeNumeros();
        int[] numeros = cargarNumeros(cantidadDeNumeros);
        int numeroMasRepetido = calcularNumeroMasRepetido(numeros);

        System.out.println("El promedio de los numeros ingresados es "+ calcularPromedio(numeros));

        System.out.println("El numero mas repetido es el "+ numeroMasRepetido + " y se ha repetido "+ calcularNumeroRepetidoVeces(numeros, numeroMasRepetido)+" veces");
    }

    private static int calcularNumeroRepetidoVeces(int[] numeros, int numeroMasRepetido) {
        /*
        Agregar logica paa calcular cuantas veces se repite el numero mas repetido.
         */
        return 0;
    }

    private static int calcularNumeroMasRepetido(int[] numeros) {
        /*
        Agregar logica para encontrar el numero mas repetido
         */
        return 0;
    }

    private static double calcularPromedio(int[] numeros) {
        /*
        Hacer logica para calcular el promedio de los numeros ingresados
         */

        return 0;
    }

    private static int definirCantidadDeNumeros() {
        Scanner teclado = new Scanner(System.in);
        /*
        Agregar logica aqui para definir la cantidad de numeros
        que se vea asi por ejemplo:
        Cuantos numeros desea ingresar:
        4
         */
        return 0;
    }

    private static int[] cargarNumeros(int cantidad) {
        Scanner teclado = new Scanner(System.in);
        int[] numerosAuxiliar = new int[cantidad];
        /*
            Agregar logica para cargar los numeros.
            Que se vea asi:
            Ingrese numero 1:
            2
            Ingrese numero 2:
            8
            etc...
         */
        return  numerosAuxiliar;
    }
}

/*
Ejemplo de ejecucion 1:
        Cuantos numeros desea ingresar:
        5
        Ingrese numero 1:
        4
        Ingrese numero 2:
        12
        Ingrese numero 3:
        0
        Ingrese numero 4:
        5
        Ingrese numero 5:
        21
        El promedio de los numeros ingresados es 9,4
        El numero mas repetido es el 5 y se ha repetido 2 veces

Ejemplo de ejecucion 2:
        Cuantos numeros desea ingresar:
        3
        Ingrese numero 1:
        3
        Ingrese numero 2:
        3
        Ingrese numero 3:
        4
        El promedio de los numeros ingresados es 3.33333
        El numero mas repetido es el 3 y se ha repetido 2 veces


 */