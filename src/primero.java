import java.util.Scanner;

public class primero {

    public static void main(String[] args) {
        //  Ejercico 3 - Ingrese X numeros y  muestre el mayor
        Scanner teclado = new Scanner(System.in);

        int cantidadDeNumeros;
        int mayor = 0;

        cantidadDeNumeros = elegirLargoDelArray();

        int[] numeros = new int[cantidadDeNumeros];

        cargarNumerosEnArray(numeros);
        mayor = calcularMayorNumeroEnArray(numeros);

        System.out.println("El mayor numero es: "+mayor);

    }

    private static int elegirLargoDelArray() {
        int largoDeArray = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Ingrese la cantidad de numeros que desea ingresar:");
            largoDeArray = teclado.nextInt();
        }while(largoDeArray < 1);
        return largoDeArray;
    }

    private static int calcularMayorNumeroEnArray(int[] arrayX) {
        int mayor = 0;
        for (int i = 0; i < arrayX.length; i++) {
            if ( i == 0) {
                mayor = arrayX[i];
            }
            if (arrayX[i]> mayor) {
                mayor = arrayX[i];
            }
        }
        return mayor;
    }

    public static void cargarNumerosEnArray(int[] arrayX) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < arrayX.length; i++) {
            System.out.println("Ingrese el numero de la posicion " + i);
            arrayX[i] = teclado.nextInt();
        }
    }
    /*
     TIPO DE VARIABLES - ocupa un espacio de memoria:
     * Primitivas:
     - Numerico
        - enteros
            byte -128 a 127
            short -32mil a 32mil
            int -2.1 mil millones a 2.2 mil millones
            long -2 con 63 ceros a 2 con 63 ceros (subFijo L o l )
        - decimales
            float 6 a 7 cifras decimales (subFijo F o f )
            double 15 cifras decimales
     - Caracter
        char - caracter entre comillas simples, numero representado en codigo ascii 0 to 65535
     - Booleano (logico)
        boolean - Solo dos valores true o false
     * Referencia a Objetos - instancia de una clase
       String -> Cadena de caracteres

     * Operadores Logicos / Loops / Condicionales
        if (CONDICION) // la condicion siempre devuelve un boolean
          ...
          else
          ....
     */
}
