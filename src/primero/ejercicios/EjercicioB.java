package primero.ejercicios;
/*
Realice un programa donde ingrese X numeros, y que nos muestre el promedio de todos los numeros pares
*/

import java.util.Scanner;

public class EjercicioB {
    public static void main(String[] args) {
        int cantidadDeNumeros;
        cantidadDeNumeros = largoDelArray();
        int numeros[]=new int [cantidadDeNumeros];
       cargarNumerosEnElArray(numeros);
        // promedioDeNumerosPares();

    }

    private static void cargarNumerosEnElArray(int[] numeros) {
        Scanner teclado = new Scanner(System.in);
        for (int i=0; i<numeros.length; i++){
        System.out.println("Ingrese un numero : ");
        numeros[i]=teclado.nextInt();}

    }

    private static int largoDelArray() {
        int cantidadDeNumeros = 0 ;
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese la cantidad de numeros q desea ingresar : ");
        cantidadDeNumeros = teclado.nextInt();
        return cantidadDeNumeros;
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