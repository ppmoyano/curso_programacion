import java.util.Scanner;

public class primero {

    public static void main(String[] args) {
        //Estoy comentandotodo porque no se como empezar una hoja nueva
        Scanner EntradaScanner = new Scanner(System.in);
        int maximo;
        int num;
        int mayor = 0; //si mayor ya tiene un vaalor supongo que puedo avanzar con el resto
        int cont;

        System.out.println("Inserte el máximo de números");
        maximo = EntradaScanner.nextInt();

        for (cont = 0; cont < maximo; cont++) { //Pensé que tenía que poner mayor o igual, pero a prueba y error... me di cuenta que no
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