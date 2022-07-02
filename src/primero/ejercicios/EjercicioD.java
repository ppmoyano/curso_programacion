package primero.ejercicios;
/*
Un numero PRIMO es aquel numero que es divisible solo por 1 y por si mismo.
Realice un programa donde ingrese un numero, y el programa muestre todos los numeros primos hasta ese numero inclusive (si es que es primo).
Ejemplis de numeros primos hasta 20:
2,3,5,7,11,13,17
 */


import java.util.Scanner;

public class EjercicioD {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = ingresarNumero();
        esPrimo(numero);
        String resultado;
        resultado = losAnterioressonPrimos(numero);
        System.out.println(resultado);
        System.out.println("FIN DEL PROGRAMA");
    }

    private static String losAnterioressonPrimos(int numero) {
        int todosLosNumeros = 1;
        String resultado ="";
        while (todosLosNumeros < numero) {
            if (esPrimo(todosLosNumeros)) {
                resultado += "  " + todosLosNumeros + " ";
            }
            todosLosNumeros++;
        }

        return resultado;
    }


    private static boolean esPrimo(int numero) {
        boolean esNumeroPrimo = true;
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                esNumeroPrimo = false;
            }
        }
        return esNumeroPrimo;
    }


    private static int ingresarNumero() {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        do {
            System.out.println("Ingrese un numero: ");

            numero = teclado.nextInt();
            if (numero < 2) {
                System.out.println("No puede ingresar un numero menor a 2 ");
            }
        } while (numero < 2);
        return numero;
    }
}
/*
EJEMPLOS DE EJECUCION 1:
Ingrese un numero:
10
2,3,5,7
FIN DEL PROGRAMA

EJEMPLOS DE EJECUCION 2:
Ingrese un numero:
100
2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97
FIN DEL PROGRAMA

EJEMPLOS DE EJECUCION 3:
Ingrese un numero:
1
No puede ingresar un numero menor a 2, ingrese otro numero:
5
2,3,5
FIN DEL PROGRAMA

EJEMPLOS DE EJECUCION 4:
Ingrese un numero:
0
No puede ingresar un numero menor a 2, ingrese otro numero:
2
2
FIN DEL PROGRAMA
 */