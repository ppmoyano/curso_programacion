package primero.ejercicios;
/*
Realice un programa donde ingrese X numeros, y que nos muestre el promedio de todos los numeros pares
*/

import java.util.Scanner;

import static primero.ejercicios.EjercicioA.largoDelArray;
 */
public class EjercicioB {
    public static void main(String[] args) {
//NO ESTA TERMINADO NO ENCUENTRO TODAVIA COMO DIVIDIR EL TOTAL DE PARES SOLO POR LOS PARES. ME LOS DIVIDE POR TODO EL LARGO DEL ARRAY
        int cantidadDeNumeros = largoDelArray();
        int [] numeros = new  int [cantidadDeNumeros];
        cargarNumerosEnArray (numeros);

        System.out.println("El promedio de todos los numeros pares es de: " + calcularPromedio(numeros));





    }




    private static double calcularPromedio(int[] numeros) {
        Scanner teclado = new Scanner(System.in);
        double promedio = 0;
        double suma = 0;

        for (int i = 0; i <= numeros.length - 1; i++) {
            if (numeros[i] % 2 == 0) {
                suma += numeros[i];
            }
                promedio = suma / numeros.length;


        }
        return promedio;
    }




    private static void cargarNumerosEnArray(int[] numeros) {
        Scanner teclado = new Scanner(System.in);
        for (int i=0;i <= numeros.length-1;i++) {
            System.out.println("Ingrese el numeros " + (i+1));
            numeros[i] = teclado.nextInt();
        }

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
