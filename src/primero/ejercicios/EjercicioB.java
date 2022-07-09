package primero.ejercicios;
/*
Realice un programa donde ingrese X numeros, y que nos muestre el promedio de todos los numeros pares
*/


//FUNCIONA, PERO EL CÓDIGO NO TERMINA DE ESTAR LINDO AUNQUE LE DE VUELTAS.
import java.util.Arrays;
import java.util.Scanner;

public class EjercicioB {
    public static void main(String[] args) {
        int numeros = inserteNumeros();
        sumarNumeros(numeros);


    } //public static void main(String[] args)

    public static int inserteNumeros() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuántos números desea ingresar?");
        int numeros = teclado.nextInt();
        return numeros;
    }

    public static void sumarNumeros(int numeros) {
        Scanner teclado = new Scanner(System.in);
        int i = 0;
        int numASumar = 0;
        double sumaPares= 0;
        int n = 0;
        for (i = 0; i < numeros; i++) {
            System.out.println("Ingrese un número");
            numASumar = teclado.nextInt();
            if (numASumar < 1) {
                System.out.println("No puede ingresar un valor menor a 1");
                i--; //no me acuerdo una opción mejor para seguir sin que se termine el programa
            }
            if (numASumar % 2 == 0) {
                n++;
                sumaPares += numASumar;
            }
        }
        int[] cantidadPares = new int[n];
        System.out.println("El promedio de los numeros pares es "+(sumaPares/ cantidadPares.length));
    }

} // class EjercicioB
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