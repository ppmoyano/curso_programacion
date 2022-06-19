package primero.ejercicios;

/*
Realice un programa donde ingrese X numeros, y que nos muestre el resultado de la suma de todos los numeors menores a 5
*/


import java.util.Scanner;

public class EjercicioA {
    public static void main(String[] args) {

        int cantidadDeNumeros = largoDelArray();
        int [] numeros = new int [cantidadDeNumeros];
        cargarNumerosEnArray (numeros);
        int sumaEnArray = calcularSumaEnArray (numeros);
        System.out.println("La suma de todos los numeros menores a cinco es:  " + sumaEnArray);
    }



    private static int calcularSumaEnArray(int[] numeros) {
        int suma = 0;
        for (int i=0;i <= numeros.length-1;i++)
            if (numeros[i] < 5) {
                suma += numeros[i];
            } return  suma;
    }


    static void cargarNumerosEnArray(int[] numeros) {
        Scanner teclado = new Scanner(System.in);
        for ( int i=0; i <= numeros.length-1 ; i++ ) {
            System.out.println("Ingrese el numero " + (i+1));
            numeros[i] = teclado.nextInt();
        }


    }

    static int largoDelArray() {
        int largoDelArray=0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Ingrese la cantidad de numeros que desea utilizar");
            largoDelArray = teclado.nextInt();
                    } while (largoDelArray < 1);
        return largoDelArray;
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