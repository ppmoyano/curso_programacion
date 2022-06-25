package primero.ejercicios;
/*
Realice un programa donde ingrese X numeros, y que nos muestre el resultado de la suma de todos los numeors menores a 5
*/

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioA {
    public static void main(String[] args) {

        int cantidadNumeros = numerosPorCargar();
        sumaDeMenoresDe5(menoresDe5(cargaDeNumeros(cantidadNumeros)));
    }

    private static int[] menoresDe5(int[] listaNumeros) {
        int[] numerosMenoresa5 = new int[listaNumeros.length];
        int i = 0;
        for (i = 0; i < listaNumeros.length; i++) {
            if (listaNumeros[i] < 5) {
                numerosMenoresa5[i] = listaNumeros[i];
            }
        }
        return numerosMenoresa5;
    }

    private static int[] cargaDeNumeros(int cantidadNumeros) {
        /* Este sirve para cargar los números, la cantidad se decide antes, con numerosPorCargar. No deja cargar valores menores de 1*/
        Scanner teclado = new Scanner(System.in);
        int i = 0;
        int[] listaNumeros = new int[cantidadNumeros];
        for (i = 0; i < listaNumeros.length; i++) {
            System.out.println("Ingrese el número " + (i + 1));
            listaNumeros[i] = teclado.nextInt();
            if (listaNumeros[i] < 1) {
                System.out.println("No puede ingresar un valor menor a 1");
                i--; //no me acuerdo una opción mejor para seguir sin que se termine el programa
            }
        }
        return listaNumeros;
    }

    public static int[] sumaDeMenoresDe5(int[] numerosMenoresa5) {
        /* Acá solamente va a sumar los números menores de 5, e ignorar el resto */
        int sumaDeMenoresDe5 = Arrays.stream(numerosMenoresa5).sum(); // esto es 100% robado de internet
        if (numerosMenoresa5.length != 0) {
            System.out.println("El resultado de la suma de los numeros menores a 5 = " + sumaDeMenoresDe5);
        }
        else { //Este no me anda, no se porqué, probé con else if, hasta invirtiendo las opciones y no lo puedo hacer andar.
            System.out.println("No hay números menores de 5");
        }
return new int[]{sumaDeMenoresDe5};
    }

    public static int numerosPorCargar() {
        /* Aca se va a decidir la cantidad de numeros a cargar y los devuelve con el int numeros*/
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