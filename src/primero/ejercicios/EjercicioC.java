package primero.ejercicios;

/*
Realice un programa donde ingrese X numeros, cuando ingrese el numero muestre un mensaje que diga
"NUMERO PAR" o "NUMERO IMPAR" si el numero es par o impar
y que nos muestre la suma de los numeros pares y la suma de los numeros impares
Si hay mas pares que impares, muestre un mensaje GANARON LOS PARES
Si hay mas impares que pares, muestre un mensaje GANARON LOS IMPARES
Y si empataron, muestre un mensaje que diga EMPATE
*/

import java.util.Scanner;

public class EjercicioC {
    public static void main(String[] args) {
        int cantidadDeNumeros = largoDelArray();
        int[] numeros = new int[cantidadDeNumeros];
        cargarNumerosEnArray(numeros);
        System.out.println("La suma de numeros Pares es de: " + sumaNumerosPares(numeros));
        System.out.println("La suma de los numeros impares es de: " + sumaNumerosImpares(numeros));
        gananLosNumeros (numeros);
    }

    private static String gananLosNumeros(int[] numeros) {
        if (sumaNumerosPares( numeros) > sumaNumerosImpares(numeros)) {
            System.out.println("GANAN LOS PARES");}
            if (sumaNumerosPares(numeros) < sumaNumerosImpares(numeros)) {
                System.out.println("GANAN LOS IMPARES");}
                if (sumaNumerosPares(numeros) == sumaNumerosImpares(numeros)) {
                    System.out.println("EMPATE");
                }


        return "";
    }


    private static void cargarNumerosEnArray(int[] numeros) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un numero: ");
            numeros[i] = teclado.nextInt();
            if (numeros[i] % 2 == 0) {
                System.out.println("NUMERO PAR");
            } else {
                System.out.println("NUMERO IMPAR");
            }
        }
    }

    private static int largoDelArray() {
        int largoDelArray = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Ingrese la cantidad de numeros que desea utilizar");
            largoDelArray = teclado.nextInt();
        } while (largoDelArray < 1);
        return largoDelArray;
    }
    private static int sumaNumerosPares(int[] numeros) {
        int sumaNumerosPares= 0;

        for (int i=0; i<numeros.length; i++) {
            if (numeros[i] % 2 ==0) {
            sumaNumerosPares+= numeros[i];
            }
        }
        return sumaNumerosPares;
    }

    private static int sumaNumerosImpares(int[] numeros) {
        int sumaNumerosImpares = 0;
        for (int i=0; i < numeros.length ; i++) {
            if (numeros[i] %2 != 0) {
                sumaNumerosImpares += numeros[i];
            }
        }
        return sumaNumerosImpares;
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