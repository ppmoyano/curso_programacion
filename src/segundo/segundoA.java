package segundo;

import java.util.Scanner;

public class segundoA {

    /*
    a)Realice un programa donde ingrese un numero y se muestre todo los numeros desde 0 hasta el mismo numero inclusive.
    por ejemplo si ingreso 3, que muestre 0, 1 , 2 y 3.
*/
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int NUMERO;
        System.out.println("Ingrese un Numero: ");
        NUMERO= teclado.nextInt();

        for (int i = NUMERO; i >=0 ; i--) {
            System.out.println(i); }
      }
}


    /*b)Si el numero ingresado es menor a 0 mostrar un mensaje de error

            public static void main(String[] args) {
                Scanner teclado = new Scanner(System.in);
                int NUMERO;
                System.out.println("Ingrese un Numero: ");
                NUMERO= teclado.nextInt();

                if ( NUMERO<0 ) System.out.println("ERROR");

                for (int i = NUMERO; i >=0 ; i--) {
                    System.out.println(i);
                }
            }
} */
    /*c) Una vez que el programa finalice pregunte si quiere volver a realizarlo, y
    que lo haga hasta que el usuario ingrese 0.
     */

   /*public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int NUMERO;
        int opcion;

        System.out.println("Ingrese un Numero: ");
        NUMERO= teclado.nextInt();

        if ( NUMERO<0 ) System.out.println("ERROR");

         for  (int i = NUMERO; i >=0 ; i--) {
            System.out.println(i);  }

            do {System.out.println("INGRESE OTRO NUMERO O CERO PARA FINALIZAR");
                opcion = teclado.nextInt();
                if ( opcion<0 ) System.out.println("ERROR");
                for  (int i =opcion; i >=0 ; i--) {
                    System.out.println(i);  }
            }while(opcion!=0);




    }
}
  */
/* private static void cargarNumerosEnArray(int[] arrayX) { //entre parentesis el metodo recibe un parametro
        //nosotros decimos de que tipo va a ser el parametro que recibe en este caso int[] y le ponemos un nombre para usar dentro del
        //metodo. Es decir cuando nosotros llamemos al metodo le vamos a pasar un array de ints, no sabemos como se llama el que les pasa
        //pero cuando esta aca se comporta en este caso como arrayX
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < arrayX.length; i++) {
            System.out.println("Ingrese el numero de la posicion " + i);
            arrayX[i] = teclado.nextInt();*/
