package tercero.ejercicio3a;

import java.util.Scanner;

/*
Este es un programa para registar los alumnos para la escuela primaria Carlos Paz del año que viene.
En la escuela vamos registatondo todos los niños que se vienen a anotar.
Se anota el nombre, apellido, y la edad. El niño no puede tener menos de 6 años ni mas de 8 para inscribirse.
Si no cumple con esta condicion se le dice Que no cumple con la edad necaria.
Una vez inscripto se muestra el mensaje - NIÑO REGISTRADO mas la informacion del niño.
Y tenemos un cupo maximo de 5 alumnos, asi que si se llena ese cupo el programa termina con el mensaje "CUPO COMPLETO"
Al finalizar el programa mostrar el mensaje "FIN DEL PROGRAMA"
 */
public class Ejercicio3a {


    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        Alumno[] Alumnos = new Alumno[5];

        int opcion=0;
    do { System.out.println("Desea ingresar un niño: 1 - Si 2 - Salir");
        opcion = teclado.nextInt();
        if ( opcion==1 ) {
            Alumnos[i] = new Alumno();
            Alumnos[i].cargarAlumno();
            if  { Alumnos[i].getEdad() < 6 || Alumnos[i].getEdad() > 8
                {System.out.println("El niño no cumple con la edad necesaria");
                    i=i-1;
        }
        else if { Alumnos[i].getEdad() > 6 && Alumnos[i].getEdad() < 8 {
            System.out.println("Alumno registrado ");
                }

    }
    }
}



/*
EJEMPLO DE EJECUCION 1:
Desea ingresar un niño: 1 - Si 2 - Salir
1
Ingrese el nombre:
Sabri
Ingrese el apellido:
Rizzo
Ingrese la edad:
7
NIÑO REGISTRADO - Sabri Rizzo de 7 años de edad
Desea ingresar un niño: 1 - Si 2 - Salir
1
Ingrese el nombre:
Pablo
Ingrese el apellido:
Marmol
Ingrese la edad:
10
El niño no cumple con la edad necesaria
Desea ingresar un niño: 1 - Si 2 - Salir
1
Ingrese el nombre:
Pablo
Ingrese el apellido:
Marmol
Ingrese la edad:
7
NIÑO REGISTRADO - Pablo Marmol de 7 años de edad
Desea ingresar un niño: 1 - Si 2 - Salir
1
Ingrese el nombre:
Pedro
Ingrese el apellido:
Picapiedra
Ingrese la edad:
7
NIÑO REGISTRADO - Pedro Picapiedra de 7 años de edad
Desea ingresar un niño: 1 - Si 2 - Salir
1
Ingrese el nombre:
Vilma
Ingrese el apellido:
Palma
Ingrese la edad:
7
NIÑO REGISTRADO - Vilma Palma de 7 años de edad
Desea ingresar un niño: 1 - Si 2 - Salir
1
Ingrese el nombre:
Leon
Ingrese el apellido:
Corazon
Ingrese la edad:
7
NIÑO REGISTRADO - Leon Corazon de 7 años de edad
CUPO COMPLETO
Fin del programa


EJEMPLO DE EJECUCION 2:
Desea ingresar un niño: 1 - Si 2 - Salir
2
Fin del programa
 */
