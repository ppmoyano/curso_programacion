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





//dos cierres finales, ni hay que tocarlos
    }
}

class mostrarNumeros {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int numero;
        int opcion;
        do {
        System.out.println("Ingrese un numero mayor a 0");
        numero = teclado.nextInt();

        if (numero <= 0) {
            do {
                System.out.println("El numero ingresado no es correcto, ingrese un numero mayor a 0");
                numero = teclado.nextInt();
            }
            while (numero <= 0);
        }
        for (int i = 0; i <= numero; i++) {
            System.out.println(i);
        }
    System.out.println("Ingrese cualquier número para volver a realizarlo");
    System.out.println("caso contrario, ingrese 0");
    opcion = teclado.nextInt();
}
while (opcion != 0);
}
}
