package segundo;

import java.util.Arrays;
import java.util.Scanner;

/*
- Realice un programa donde ingrese X numeros, muestre el promedio, y cual  el numero mas ingresado y cuantas veces se ingreso
 */
public class segundoC {
    //CREO QUE ESTE ANDA TAMBIÉN
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int cantidadDeNumeros = definirCantidadDeNumeros();
        int[] numeros = cargarNumeros(cantidadDeNumeros);
        int numeroMasRepetido = calcularNumeroMasRepetido(numeros);

        System.out.println("El promedio de los numeros ingresados es "+ calcularPromedio(numeros));

        System.out.println("El numero mas repetido es el "+ numeroMasRepetido + " y se ha repetido "+ calcularNumeroRepetidoVeces(numeros, numeroMasRepetido)+" veces");
    }


    // CREO QUE ESTE YA ANDA
    private static int definirCantidadDeNumeros() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuántos numeros desea ingresar?");
        int cantidad = teclado.nextInt();
        /*
        Agregar logica aqui para definir la cantidad de numeros
        que se vea asi por ejemplo:
        Cuantos numeros desea ingresar:
        4
         */
        return cantidad;
    }

    private static int[] cargarNumeros(int cantidad) {
        Scanner teclado = new Scanner(System.in);
        int[] numerosAuxiliar = new int[cantidad];
        for(int i=0; i<=cantidad-1; i++)
        {
            System.out.print("Ingresar nombre #" + (i+1) + ":"); //Fue la forma que se me ocurrió para que no aparezca el cero
            int numero = teclado.nextInt();
            numerosAuxiliar [i] = numero;
        }

        /*
            Agregar logica para cargar los numeros.
            Que se vea asi:
            Ingrese numero 1:
            2
            Ingrese numero 2:
            8
            etc...
         */
        return  numerosAuxiliar;
    }


//Esta cosa robada paraece que anda
    private static int calcularNumeroRepetidoVeces(int[] numeros, int numeroMasRepetido) {
        int repetido[] = new int[numeros.length];

        for (int i = 0; i <= numeros.length - 1; i++) {
            for (int j = 0; j <= numeros.length - 1; j++) {
                if (numeros[i] == numeros[j]) {
                    repetido[i]++;
                }
            }
            numeroMasRepetido = repetido[i];
        }

        /*
        Agregar logica paa calcular cuantas veces se repite el numero mas repetido.
         */
        return numeroMasRepetido;
    }

    private static int calcularNumeroMasRepetido(int[] numeros) {
        int repetido[] = new int[numeros.length];
        int numeroRepetido = 0;
        for (int i = 0; i <= numeros.length - 1; i++) {
            for (int j = 0; j <= numeros.length - 1; j++) {
                if (numeros[i] == numeros[j]) {
                    numeroRepetido = numeros [i];
                }
            }
        }
        return numeroRepetido;
    }
//PARECE QUE YA ANDA
    private static double calcularPromedio(int[] numeros) {
        Scanner teclado = new Scanner(System.in);
        double promedio = 0;
        double suma = 0;
        for(int i=0; i<=numeros.length-1; i++)
        {
            suma+= numeros[i];
        }
        promedio = suma / numeros.length;
        return promedio;
        /*
        Hacer logica para calcular el promedio de los numeros ingresados
         */
    }




}

/*
Ejemplo de ejecucion 1:
        Cuantos numeros desea ingresar:
        5
        Ingrese numero 1:
        4
        Ingrese numero 2:
        12
        Ingrese numero 3:
        0
        Ingrese numero 4:
        5
        Ingrese numero 5:
        21
        El promedio de los numeros ingresados es 9,4
        El numero mas repetido es el 5 y se ha repetido 2 veces

Ejemplo de ejecucion 2:
        Cuantos numeros desea ingresar:
        3
        Ingrese numero 1:
        3
        Ingrese numero 2:
        3
        Ingrese numero 3:
        4
        El promedio de los numeros ingresados es 3.33333
        El numero mas repetido es el 3 y se ha repetido 2 veces


 */