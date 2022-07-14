package primero.ejercicios;
/*
Un numero PRIMO es aquel numero que es divisible solo por 1 y por si mismo.
Realice un programa donde ingrese un numero, y el programa muestre todos los numeros primos hasta ese numero inclusive (si es que es primo).
Ejemplis de numeros primos hasta 20:
2,3,5,7,11,13,17
 */
//ESTE TODAVÍA NO ME ANDA, LE COPIÉ A LUCAS LA FÓRMULA PERO NO LA PUEDO TRADUCIR PARA QUE ME MUESTRE LA CANTIDAD QUE QUIERO
import java.util.Scanner;

public class EjercicioD {
    public static void main(String[] args) {
        int num = ingresarNumero();
        String resultado = "";
        int i = 2;
        int contador = 0;
        while (contador < 10) {
            if (esPrimo(num)) {
                resultado += num + ", ";

            }
            contador++;
            num++;
        }
        System.out.println("Los numeros primos son" + resultado);

        /*
        String resultado = "";
        int i = 2;
        int contador = 0;
        while (contador < 10) {
            //for (i = 2; i < num; i++) {

          //  }
            if (esPrimo(num)) {
                resultado += num + ", ";
                contador++;
            }
            num++;
        }
        System.out.println("Los numeros primos son" + resultado);
        */
    }

    private static Boolean esPrimo(int num) {
        Boolean elNumeroEsPrimo = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                elNumeroEsPrimo = false;
            }
        }
        return elNumeroEsPrimo;
    }


    public static int ingresarNumero() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int num = teclado.nextInt();
        return num;
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