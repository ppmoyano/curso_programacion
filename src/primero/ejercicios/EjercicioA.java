package primero.ejercicios;
/*
Realice un programa donde ingrese X numeros, y que nos muestre el resultado de la suma de todos los numeors menores a 5
*/

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioA {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int sumaDeNumeros = inserteNumeros();
        int i = 0;
        int listaNumeros[] = new int[sumaDeNumeros];
        int numerosMenoresa5[] = new int[sumaDeNumeros];
        for (i = 0; i < listaNumeros.length; i++) {
            System.out.println("Ingrese el número " + (i + 1));
            listaNumeros[i] = teclado.nextInt();
            if (listaNumeros[i] < 1) {
                System.out.println("No puede ingresar un valor menor a 1");
                i--; //no me acuerdo una opción mejor para seguir sin que se termine el programa
            }
            else if (listaNumeros[i] < 5) {
                numerosMenoresa5[i] = listaNumeros[i];
            }
        }

        int sumaDeMenoresDe5 = Arrays.stream(numerosMenoresa5).sum(); // esto es 100% robado de internet
        System.out.println("El resultado de la suma de los numeros menores a 5 = " + sumaDeMenoresDe5);

    }
    public static int inserteNumeros() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuántos números desea ingresar?");
        int numeros = teclado.nextInt();
        return numeros;
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