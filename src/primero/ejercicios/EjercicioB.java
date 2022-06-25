package primero.ejercicios;
/*
Realice un programa donde ingrese X numeros, y que nos muestre el promedio de todos los numeros pares
*/

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioB {
    public static void main(String[] args) {
        int numeros = inserteNumeros();
        sumaYPromedioPares(numeros, sumaNumeros(numeros));
    }

    private static void sumaYPromedioPares(int numeros, int[] sumaNumeros) {
        //Acá va a revisar los números cargados, sumar los que sean pares y mostrar el promedio
        int i = 0;
        int[] numerosPares = new int[numeros];
        for (i = 0; i < numeros; i++) {
            if (sumaNumeros[i] % 2 == 0) {
                numerosPares[i] = sumaNumeros[i];
            }
        }
        double sumaPares = Arrays.stream(numerosPares).sum();
        System.out.println("El promedio de los numeros pares es "+(sumaPares /numerosPares.length));
    }




    public static int inserteNumeros() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuántos números desea ingresar?");
        int numeros = teclado.nextInt();
        return numeros;
    }

    public static int[] sumaNumeros(int numeros) {
        Scanner teclado = new Scanner(System.in);
        int[] sumaNumeros = new int[numeros];
        int i = 0;
        for (i = 0; i < numeros; i++) {
            System.out.println("Ingrese un número");
            sumaNumeros[i] = teclado.nextInt();
            if (sumaNumeros[i] < 1) {
                System.out.println("No puede ingresar un valor menor a 1");
                i--; //no me acuerdo una opción mejor para seguir sin que se termine el programa
            }
        }
        return sumaNumeros;
    }
}
/*
Ejemplo:
Cuantos numeros desea ingresar?
6
Ingrese un numero:
2
Ingrese un numero:
7
Ingrese un numero:
4
Ingrese un numero:
5
Ingrese un numero:
12
Ingrese un numero:
9
El promedio de los numeros pares es: 6

Ejemplo 2:
Cuantos numeros desea ingresar?
0
No puede ingresar un valor menor a 1
 */