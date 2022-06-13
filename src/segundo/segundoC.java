package segundo;

import java.util.Arrays;
import java.util.Scanner;

/*
- Realice un programa donde ingrese X numeros, muestre el promedio, y cual  el numero mas ingresado y cuantas veces se ingreso
 */
    public class segundoC {

        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            int cantidadDeNumeros = definirCantidadDeNumeros();
            int[] numeros = cargarNumeros(cantidadDeNumeros);
            int numeroMasRepetido = calcularNumeroMasRepetido(numeros);
            System.out.println("El promedio de los numeros ingresados es "+ calcularPromedio(numeros));
            System.out.println("El numero mas repetido es el "+ numeroMasRepetido + " y se ha repetido "+ calcularNumeroRepetidoVeces(numeros, numeroMasRepetido)+" veces");
        }

    private static int calcularNumeroRepetidoVeces(int[] numeros, int numeroMasRepetido) {
       int veces=0;
        for(int i=1;i<numeros.length;i++) {
            if (numeroMasRepetido == numeros[i])
            veces= veces+1 ;
        }
        if (veces == 0) System.out.println("No se repite ningun numero");
            return veces;
    }
       private static int calcularNumeroMasRepetido(int[] numeros) {
           int numeroMasRepetido = 0;
           for(int i=1;i<numeros.length-1;i++){
               if(numeros[i]==numeros[i+1]){
                   numeroMasRepetido=numeros[i]; }
           return numeroMasRepetido; }
           return numeroMasRepetido;
       }
        private static double calcularPromedio(int[] numeros) {
            double promedio;
            promedio= (Arrays.stream(numeros).sum() )/ (numeros.length - 1);
            return promedio;
        }

        private static int definirCantidadDeNumeros () {
            int cantidadDeNumeros;
            Scanner teclado = new Scanner(System.in);
            System.out.println("cuantos numeros desea ingresar? ");
            cantidadDeNumeros = teclado.nextInt();
            return cantidadDeNumeros + 1;
        }

        private static int[] cargarNumeros(int cantidad) {
            Scanner teclado = new Scanner(System.in);
            int[] numerosAuxiliar = new int[cantidad];

            for(int i = 1; i < cantidad; i++) {
                System.out.println("ingrese Numero: " + i );
                numerosAuxiliar[i] = teclado.nextInt();
            }

                return  numerosAuxiliar;
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
