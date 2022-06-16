/*package segundo;

import java.util.Scanner;

/*
- Realice un programa donde ingrese X numeros, muestre el promedio, y cual  el numero mas ingresado y cuantas veces se ingreso
 */
//public class segundoC {
    //NO SE QUE PASO QUE NO ME LEE LOS METODOS QUE HABIAS CREADO VOS!!

  /*  public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int cantidadDeNumeros = definirCantidadDeNumeros();
        int[] numeros = cargarNumeros(cantidadDeNumeros);
        int numeroMasRepetido = calcularNumeroMasRepetido(numeros);

        System.out.println("El promedio de los numeros ingresados es "+ calcularPromedio(numeros));

        System.out.println("El numero mas repetido es el "+ numeroMasRepetido + " y se ha repetido "+ calcularNumeroRepetidoVeces(numeros, numeroMasRepetido)+" veces");
    }



/*
    private static int calcularNumeroRepetidoVeces(int[] numeros, int numeroMasRepetido) {
        Scanner teclado = new Scanner(System.in);
        int nRepetido[] = new int[numeros.length];

        for (int i = 0; i <= numeros.length - 1; i++) {
            for (int j = 0; j <= numeros.length - 1; j++) {
                if (numeros[i] == numeros[j]) {
                    nRepetido[i]++;
                }
            } numeroRepetido = nRepetido[i];}
        /*
        Agregar logica paa calcular cuantas veces se repite el numero mas repetido.
                    return 0;
                }

                private static int calcularNumeroMasRepetido ( int[] numeros){

/*        Agregar logica para encontrar el numero mas repetido
                    int[] repetido = new int[numeros.length];
                    int numeroRepetido = 0;
                    for (int i = 0; i <= numeros.length - 1; i++) {
                        for (int x = 0; x < numeros.length - 1; x++) {
                            if (numeros[i] == numeros[x]) {
                                numeroRepetido = numeros[i];
                            }
                        }*/

            /*            return numeroRepetido;
                    }

                    private static double calcularPromedio( int[] numeros){
                        Scanner teclado = new Scanner(System.in);
                        int promedio = 0;
                        int suma = 0;
                        suma += numeros[i];
                        for (i = 0; i < numeros.length - 1; i++) {
                        }
                        promedio = suma / numeros.length - 1;

                        return promedio;




            /*
        Hacer logica para calcular el promedio de los numeros ingresados
         */


/*
                    }

           //         private static int definirCantidadDeNumeros () {

        /*
        Agregar logica aqui para definir la cantidad de numeros
        que se vea asi por ejemplo:
        Cuantos numeros desea ingresar:
        4
         */
                      /*  int cantidadDeNumeros = 0;
                        Scanner teclado = new Scanner(System.in);
                        do {
                            System.out.println("Escriba la cantidad de numeros a ingresar: ");
                            cantidadDeNumeros = teclado.nextInt();
                        } while (cantidadDeNumeros < 1);

                        return cantidadDeNumeros;
                    }

                    private static int[] cargarNumeros ( int cantidad){
                        Scanner teclado = new Scanner(System.in);
                        int[] numerosAuxiliar = new int[cantidad];
                        for (int i = 0; i <= cantidad - 1; i++) {
                            System.out.println("Ingrese numero " + (i + 1));
                            numerosAuxiliar[i] = teclado.nextInt();
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
/*            return numerosAuxiliar;*/
              //      }
                //}
            //}

/*
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