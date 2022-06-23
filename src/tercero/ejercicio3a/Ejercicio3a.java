package tercero.ejercicio3a;

import tercero.ejemplo.Pelicula;

import java.util.Scanner;

/*
Este es un programa para registar los alumnos para la escuela primaria Carlos Paz del año que viene.
En la escuela vamos registatondo todos los niños que se vienen a anotar.
Se anota el nombre, apellido, y la edad. El niño no puede tener menos de 6 años ni mas de 8 para inscribirse.
Si no cumple con esta condicion se le dice Que no cumple con la edad necaria.
Una vez inscripto se muestra el mensaje - NIÑO REGISTRADO mas la informacion del niño.
Y tenemos un cupo maximo de 5 alumnos, asi que si se llena ese cupo el programa termina con el mensaje "CUPO COMPLETO"
Al finalizar el programa mostrar el mensaje "FIN DEL PROGRAMA"

a) Cuando registramos una nueva persona queremos tambien guardar el genero - 'M' para masculino 'F' para femenino.
Mostrar al final de la ejecucion cuantos NIÑOS y NIÑAS se han registrado
 */
public class Ejercicio3a {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        Persona[] alumnos = new Persona[5];
        int opcion = 0;
        int i = 0;
        do {
            System.out.println("Desea ingresar un alumno? 1: SI 2: SALIR");
            opcion = teclado.nextInt();
            if (opcion == 1) {
                alumnos[i] = new Persona();
                alumnos[i].cargarPersona();
                if (alumnos[i].getEdad() < 6 || alumnos[i].getEdad() > 8) {
                    System.out.println("ALUMNO NO CUMPLE CON LOS REQUISITOS DE EDAD");
                    i = i - 1;
                }
                else if (alumnos[i].getEdad() > 6 || alumnos[i].getEdad() < 8) {
                System.out.println("ALUMNO REGISTRADO " + alumnos[i].getNombre() + " " + alumnos[i].getApellido() +
                        " de "+ alumnos[i].getEdad() + " años."); }
            }
            i++;
        } while (i < 5 && opcion != 2);
        if (i == 5) {
            System.out.println("CUPO COMPLETO");
        }


        for (i = 0; i < 5; i++) {
            alumnos[i].mostrarPersona();
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
INGRESE EL SEXO: F
NIÑO/A REGISTRADO/A - Sabri Rizzo de 7 años de edad
Desea ingresar un niño: 1 - Si 2 - Salir
1
Ingrese el nombre:
Pablo
Ingrese el apellido:
Marmol
Ingrese la edad:
10
INGRESE EL SEXO: M
El niño no cumple con la edad necesaria
Desea ingresar un niño: 1 - Si 2 - Salir
1
Ingrese el nombre:
Pablo
Ingrese el apellido:
Marmol
Ingrese la edad:
7
INGRESE EL SEXO: M
NIÑO/A REGISTRADO/A - Pablo Marmol de 7 años de edad
Desea ingresar un niño: 1 - Si 2 - Salir
1
Ingrese el nombre:
Pedro
Ingrese el apellido:
Picapiedra
Ingrese la edad:
7
INGRESE EL SEXO: M
NIÑO/A REGISTRADO/A - Pedro Picapiedra de 7 años de edad
Desea ingresar un niño: 1 - Si 2 - Salir
1
Ingrese el nombre:
Vilma
Ingrese el apellido:
Palma
Ingrese la edad:
INGRESE EL SEXO: F
NIÑO/A REGISTRADO/A - Vilma Palma de 7 años de edad
Desea ingresar un niño: 1 - Si 2 - Salir
1
Ingrese el nombre:
Leon
Ingrese el apellido:
Corazon
Ingrese la edad:
7
INGRESE EL SEXO: F
NIÑO/A REGISTRADO/A - Leon Corazon de 7 años de edad
CUPO COMPLETO
NIÑOS:3 NIÑAS:2
Fin del programa


EJEMPLO DE EJECUCION 2:
Desea ingresar un niño: 1 - Si 2 - Salir
2
Fin del programa
 */
