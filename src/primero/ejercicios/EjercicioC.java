package primero.ejercicios;
/*
Realice un programa donde ingrese X numeros, cuando ingrese el numero muestre un mensaje que diga
"NUMERO PAR" o "NUMERO IMPAR" si el numero es par o impar
y que nos muestre la suma de los numeros pares y la suma de los numeros impares
Si hay mas pares que impares, muestre un mensaje GANARON LOS PARES
Si hay mas impares que pares, muestre un mensaje GANARON LOS IMPARES
Y si empataron, muestre un mensaje que diga EMPATE
*/
// A ESTE HAY QUE TERMINARLO BIEN
import java.util.Scanner;

public class EjercicioC {
    public static void main(String[] args) {
        int numeros = inserteNumeros();
        int num = 0;
        cargaNum(numeros);
        int sumarPares = saberSiEsPar(num);
        int sumarImpares = saberSiEsImpar(num);

        sumarParOImpar(sumarPares, sumarImpares);

    } // Cierre Main

    private static void sumarParOImpar(int sumarPares, int sumarImpares) {

        System.out.println("La suma de numeros pares es:" + sumarPares);
        System.out.println("La suma de numeros impares es:" + sumarImpares);
        if (sumarImpares < sumarPares) {
            System.out.println("GANARON LOS PARES");
        } else if (sumarImpares > sumarPares) {
            System.out.println("GANARON LOS IMPARES");
        } else {
            System.out.println("ES UN EMPATE");
        }
    }

    private static void cargaNum(int numeros) {
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        int i = 0;
        for (i = 0; i < numeros; i++) {
            System.out.println("Ingrese un numero: ");
            num = teclado.nextInt();
            if (num < 1) {
                System.out.println("No puede ingresar un valor menor a 1");
                i--; //no me acuerdo una opción mejor para seguir sin que se termine el programa
            } else {
                saberSiEsPar(num);
                saberSiEsImpar(num);
            }
        }

    }

    private static int saberSiEsImpar(int num) {
        int sumarImpares = 0;
        if (num % 2 != 0) {
            System.out.println("ES IMPAR");
            sumarImpares += num;
        }
        return sumarImpares;
    }

    private static int saberSiEsPar(int num) {
        int sumarPares = 0;
        if (num % 2 == 0) {
            System.out.println("ES PAR");
            sumarPares += num;
        }
        return sumarPares;
    }


    public static int inserteNumeros() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuántos números desea ingresar?");
        int numeros = teclado.nextInt();
        return numeros;
    }


}