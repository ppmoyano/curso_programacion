import java.util.Scanner;

public class primero {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int notaA;
        int notaB;
        int promedio;

        System.out.println("Ingrese la primer nota: ");
        notaA = teclado.nextInt();
        System.out.println("Ingrese la segunda nota: ");
        notaB = teclado.nextByte();

        promedio = (notaA + notaB) / 2;

        if ( promedio >= 6) {
            System.out.println("APROBADO");
        } else {
            System.out.println("DESAPROBADO");
        }
        System.out.println("El promedio es "+promedio);



//        String userName = myObj.nextLine();  // Read user input

        //Ejercicio 1 - Hola Mundo

        // Ejercicio 2 - Ingrese dos numeros y muestre el resultado de la suma

        //  Ejercico 3 - Ingrese tres numeros y  muestre el mayor
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
