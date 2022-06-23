package tercero.ejercicio3a;

import java.io.StringReader;
import java.util.Scanner;

/*
Aqui tenemos que agregar los campos necesarios y un metodo para mostrar la informacion del niño
*/
public class Persona {
    String nombre;
    String apellido;
    int edad;
    char genero;

    public void cargarPersona() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno");
        this.setNombre(teclado.nextLine());
        System.out.println("Ingrese el apellido del alumno");
        this.setApellido(teclado.nextLine());
        System.out.println("Ingrese la edad del alumno");
        this.setEdad(teclado.nextInt());
        System.out.println("Ingrese la letra M si el alumno es hombre o F si la alumna es mujer");
        this.setGenero(teclado.next().charAt(0));
    }

    public void mostrarPersona() {
        System.out.println("alumno: " + this.nombre + " " + this.apellido);
        System.out.println("tiene: " + this.edad + "años");
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public char getGenero() {
        return genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
}