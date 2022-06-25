package primero.ejercicios;
/*
Realice un programa donde ingrese X numeros, cuando ingrese el numero muestre un mensaje que diga
"NUMERO PAR" o "NUMERO IMPAR" si el numero es par o impar
y que nos muestre la suma de los numeros pares y la suma de los numeros impares
Si hay mas pares que impares, muestre un mensaje GANARON LOS PARES
Si hay mas impares que pares, muestre un mensaje GANARON LOS IMPARES
Y si empataron, muestre un mensaje que diga EMPATE
*/

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioC {
    public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            int numeros = inserteNumeros();
            sumaNumeros(numeros);
        }


    public static int inserteNumeros() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuántos números desea ingresar?");
        int numeros = teclado.nextInt();
        return numeros;
    }
    public static void sumaNumeros(int numeros) {
        Scanner teclado = new Scanner(System.in);
        int[] listaNum = new int[numeros];
        int[] numerosPares = new int[numeros];
        int[] numerosImpares = new int[numeros];
        int i = 0;
        for (i = 0; i < numeros; i++) {
            System.out.println("Ingrese un número");
            listaNum[i] = teclado.nextInt();
            if (listaNum[i] < 1) {
                System.out.println("No puede ingresar un valor menor a 1");
                i--; //no me acuerdo una opción mejor para seguir sin que se termine el programa
            } else if (listaNum[i] % 2 == 0) {
                numerosPares[i] = listaNum[i];
                System.out.println("NUMERO PAR");
            } else {
                numerosImpares[i] = listaNum[i];
                System.out.println("NUMERO IMPAR");
            }
        }
        System.out.println("La suma de numeros pares es:" + (Arrays.stream(numerosPares).sum()));
        System.out.println("La suma de numeros impares es:" + (Arrays.stream(numerosImpares).sum()));
        if (Arrays.stream(numerosImpares).sum() < Arrays.stream(numerosPares).sum()) {
            System.out.println("GANARON LOS PARES");
        }
        else {
            System.out.println("GANARON LOS IMPARES");
        }
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