import java.util.Scanner;

public class primero {

    public static void main(String[] args) {
        //Ejercicio 1 - Hola Mundo
        /*
        System.out.print("Hola mundo!");*/

        // Ejercicio 2 - Ingrese dos numeros y muestre el resultado de la suma

        /*
        byte n1;
        n1=5;
        byte n2;
        n2=2;
        byte resultado;
        resultado = (byte) (n1 + n2);
        System.out.print("La suma es " + resultado);
    } */
        //  Ejercico 3 - Ingrese tres numeros y  muestre el mayor

        int n1;
        int n2;
        int n3;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        n1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        n2 = scanner.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        n3 = scanner.nextInt();
        int numeroMayor = n1;
        if (n2 > numeroMayor)
            System.out.print("El numero mayor es "+n2);
        if (n3 > numeroMayor)
            System.out.print("El numero mayor es "+n3);
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