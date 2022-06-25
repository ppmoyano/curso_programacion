package primero.ejercicios;
/*
Realice un programa donde ingrese X numeros, cuando ingrese el numero muestre un mensaje que diga
"NUMERO PAR" o "NUMERO IMPAR" si el numero es par o impar
y que nos muestre la suma de los numeros pares y la suma de los numeros impares
Si hay mas pares que impares, muestre un mensaje GANARON LOS PARES
Si hay mas impares que pares, muestre un mensaje GANARON LOS IMPARES
Y si empataron, muestre un mensaje que diga EMPATE
*/

import javax.swing.*;
import java.util.Scanner;

public class EjercicioC {
    public static void main(String[] args) {
        int[] numeros = new int[largoDelArray()];
        cargarNumerosEnElArray(numeros);
        System.out.println("La suma de los numeros pares es: " + sumaDeNumerosPares(numeros));
        System.out.println("La suma de los numeros impares es: " + sumaDeNumerosImpares(numeros));
        gananParesOImpares(numeros);
    }
    private static String gananParesOImpares(int[] numeros) {

        int numerosPares =0;
        numerosPares = sumaDeNumerosPares(numeros);
        int numerosImpares=0;
        numerosImpares=sumaDeNumerosImpares(numeros);

        if (numerosPares > numerosImpares) {
            System.out.println("GANARON LOS PARES");
        }
        if (numerosPares < numerosImpares) {
            System.out.println("GANARON LOS IMPARES");
        }
        if (numerosPares == numerosImpares) {
            System.out.println("EMPATE");
        }
        return "";
    }
    private static int sumaDeNumerosImpares(int[] numeros) {
        int sumaImpares = 0;
        for (int i = 0; i < numeros.length; i++) {
            if ((numeros[i] % 2) != 0) {
                sumaImpares += numeros[i];
            }
        }
        return sumaImpares;
    }
    private static int sumaDeNumerosPares(int[] numeros) {
        int sumaPares = 0;
        for (int i = 0; i < numeros.length; i++) {
            if ((numeros[i] % 2) == 0) {
                sumaPares += numeros[i];
            }
        }
        return sumaPares;
    }
    private static void cargarNumerosEnElArray(int[] numeros) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un numero: ");
            numeros[i] = teclado.nextInt();
            if ((numeros[i] % 2) == 0) {
                System.out.println("NUMERO PAR");
            } else {
                System.out.println("NUMERO IMPAR");
            }
        }
    }
    private static int largoDelArray() {
        Scanner teclado = new Scanner(System.in);
        int cantidadDeNumeros = 0;
        do {
            System.out.println("Ingrese la cantidad de numeros q desea ingresar : ");
            cantidadDeNumeros = teclado.nextInt();
            if (cantidadDeNumeros < 1) {
                System.out.println("no puede ingresar un numero menor a 1");
            }
        } while (cantidadDeNumeros < 1);
        return cantidadDeNumeros;
    }

}
/*
Ejemplo:
Cuantos numeros desea ingresar?
6
Ingrese un numero:
2
NUMERO PAR
Ingrese un numero:
7
NUMERO IMPAR
Ingrese un numero:
4
NUMERO PAR
Ingrese un numero:
5
NUMERO IMPAR
Ingrese un numero:
12
NUMERO PAR
Ingrese un numero:
9
NUMERO IMPAR
La suma de numeros pares es: 24
La suma de numeros impares es: 21
GANARON LOS PARES

Ejemplo 2:
Cuantos numeros desea ingresar?
2
Ingrese un numero:
2
NUMERO PAR
Ingrese un numero:
3
NUMERO IMPAR
La suma de numeros pares es: 2
La suma de numeros impares es: 3
GANARON LOS IMPARES

Ejemplo 2:
Cuantos numeros desea ingresar?
0
No puede ingresar un valor menor a 1
 */