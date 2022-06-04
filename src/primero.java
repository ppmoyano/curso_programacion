import java.util.Scanner;

public class primero {

    public static void main(String[] args) {
        //Ejercicio 1 - Hola Mundo

      /*  System.out.println("HOLA MUNDO");*/

    // Ejercicio 2 - Ingrese dos numeros y muestre el resultado de la suma
/*
        int numero1;
        int numero2;
        int resultado;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un Numero: ");
        numero1 = teclado.nextInt();

        System.out.println("Ingrese otro Numero: ");
        numero2 = teclado.nextInt();

        resultado= (numero1+numero2);

        System.out.println ("el resultado es " + resultado);

*/


     //  Ejercico 3 - Ingrese tres numeros y  muestre el mayor

        int numeroA;
        int numeroB;
        int numeroC;

    Scanner teclado = new Scanner(System.in);

       System.out.println("Ingrese UN Numero: ");
       numeroA= teclado.nextInt();
       System.out.println("Ingrese UN SEGUNDO Numero: ");
       numeroB= teclado.nextInt();
       System.out.println("Ingrese UN TERCER Numero: ");
       numeroC= teclado.nextInt();

       if (numeroA>numeroB & numeroA>numeroC) System.out.println ("el mayor numero ingreado es:" + numeroA);
       if (numeroB>numeroA & numeroB>numeroC) System.out.println("el mayor numero ingreado es:"+ numeroB);
       if (numeroC>numeroA & numeroC>numeroB) System.out.println("el mayor numero ingreado es:"+ numeroC);
    }


    /* TIPO DE VARIABLES:
     * Primitivas:
     - Numerico
        - enteros
            byte -128 a 127
            short -32mil a 32mil
            int -2.1 mil milloes a 2.2 mil millones
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