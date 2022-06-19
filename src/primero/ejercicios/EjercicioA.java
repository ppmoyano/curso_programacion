package primero.ejercicios;
/*
Realice un programa donde ingrese X numeros, y que nos muestre el resultado de la suma de todos los numeors
menores a 5
*/

import java.util.Scanner;

public class EjercicioA {
    public static void main(String[] args) {

        int cantidadDeNumeros = largoDelArray();
        int[] numeros = new int[cantidadDeNumeros];
        cargarNumerosEnElArray(numeros);
        sumaNumerosMenoresDe5(numeros);
        System.out.println("la suma de los numeros menores de 5 es : " + sumaNumerosMenoresDe5(numeros));
    }

    private static int sumaNumerosMenoresDe5(int[] numeros) {
        int suma = 0;
        for (int i = 0; i <= numeros.length - 1; i++) {
            if (numeros[i] < 5) {
                suma += numeros[i];
            }
        }
        return suma;
    }

    private static void cargarNumerosEnElArray(int[] numeros) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un numero: ");
            numeros[i] = teclado.nextInt();
        }
    }

    private static int largoDelArray() {
        int cantidadDeNumeros;
        Scanner teclado = new Scanner(System.in);
        do { System.out.println("Ingrese la cantidad de numeros que desea ingresar : ");
            cantidadDeNumeros = teclado.nextInt();
            if (cantidadDeNumeros < 1) {
                System.out.println("No puede ingresar un numero menor a 1."); }
        } while (cantidadDeNumeros <1 );

        return cantidadDeNumeros;
    }
}
/*
Ejemplo:
Cuantos numeros desea ingresar?
4
Ingrese un numero:
2
Ingrese un numero:
7
Ingrese un numero:
0
Ingrese un numero:
5
El resultado de la suma de los numeros menores a 5 es: 6

Ejemplo 2:
Cuantos numeros desea ingresar?
0
No puede ingresar un valor menor a 1
 */