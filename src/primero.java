import java.util.Scanner;

public class primero {

    public static void main(String[] args) {

        /*Comento esto para seguir con el tercero
        //Ejercicio 1 - Hola Mundo
            System.out.println("Hola Mundo");
        // Ejercicio 2 - Ingrese dos numeros y muestre el resultado de la suma
            int Numero1 = 9 ;
            int Numero2 = 7 ;
            System.out.println(Numero1 + Numero2);
        Y acá dejo de comentar esto */

        //  Ejercicio 3 - Ingrese tres numeros y  muestre el mayor
        /*String Teclado;
        Scanner EntradaScanner = new Scanner (System.in);
        System.out.println ("Ingrese el primer número");
        Teclado = EntradaScanner.nextLine ();
        System.out.println ("Ingrese el segundo número");
        Teclado = EntradaScanner.nextLine ();
        System.out.println ("Ingrese el tercer número");
        Teclado = EntradaScanner.nextLine ();*/

        int Numero1;
        int Numero2;
        int Numero3;

        Scanner EntradaScanner = new Scanner (System.in);
        System.out.println ("Ingrese el primer número");
        Numero1 = EntradaScanner.nextInt ();
        System.out.println ("Ingrese el segundo número");
        Numero2 = EntradaScanner.nextInt ();
        System.out.println ("Ingrese el tercer número");
        Numero3 = EntradaScanner.nextInt ();

        int NumeroMayor = Numero1;

        if (Numero2 > NumeroMayor) {
            NumeroMayor = Numero2;
        }
        if (Numero3 > NumeroMayor) {
            NumeroMayor = Numero3;
        }
        System.out.println("El número mayor es "+NumeroMayor);

    //No se si me fui muy largo con la info o si el "int" está bien usado, robé info de internet
        // y de un curso que estuve mirando en Youtube, así que si algo de la fórmula está mal, le echamos la culpa a él
    }
    /*
     TIPO DE VARIABLES:
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
