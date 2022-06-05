import java.util.Scanner;

public class primero {

    public static void main(String[] args) {
        //Estoy comentandotodo porque no se como empezar una hoja nueva
        Scanner EntradaScanner = new Scanner(System.in);
        int maximo;
        int num;
        int mayor;
        int cont;

        System.out.println("Inserte el máximo de números");
        maximo = EntradaScanner.nextInt();

        System.out.println("Inserte un número");
        mayor = EntradaScanner.nextInt(); // La idea es que el primer número mayor sea este.

        for (cont = 0; cont < maximo -1; cont++) { //Le puse -1 porque el primer número ya está es el "mayor"
            System.out.println("Inserte un número"); //Así no me podés pedir "ahora para 20" jeje
            num = EntradaScanner.nextInt();

            if (num > mayor) {
                mayor = num; //Esta forma que ví en internet me parece aún más simple de la forma que le robé a tu hermano en el ejercicio anterior
            }
        }
        System.out.println("El número mayor es " +mayor);
    }
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

}