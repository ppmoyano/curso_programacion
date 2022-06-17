package tercero.ejercicio3a;

import java.util.Scanner;

/*
Aqui tenemos que agregar los campos necesarios y un metodo para mostrar la informacion del niño
*/
public class Persona {
String nombre;
String apellido;
int edad;

public void cargarAlumno () {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese el nombre del alumno");
    this.setNombre(teclado.nextLine());
    System.out.println("Ingrese el apellido del alumno");
    this.setApellido(teclado.nextLine());
    System.out.println("Ingrese la edad del alumno");
    this.setEdad(teclado.nextLine());



}
}
