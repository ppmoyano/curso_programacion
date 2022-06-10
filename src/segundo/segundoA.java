package segundo;

import java.util.ArrayList;
import java.util.Scanner;

public class segundoA {
/*
a)Realice un programa donde ingrese un numero y se muestre todo los numeros desde 0 hasta el mismo numero inclusive.
b)Si el numero ingresado es menor a 0 mostrar un mensaje de error
c) Una vez que el programa finalice pregunte si quiere volver a realizarlo, y que lo haga hasta que el usuario ingrese 0.
 */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;

        System.out.println("Ingrese un numero");
        numero = teclado.nextInt();

        for (int i = 0; i <= numero; i++) {
            System.out.println(i);
        }







//dos cierres finales, ni hay que tocarlos
    }
}