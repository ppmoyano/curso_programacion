package tercero.ejercicio3a;

import java.util.Scanner;

/*
Aqui tenemos que agregar los campos necesarios y un metodo para mostrar la informacion del niño
*/
public class Persona {
    String nombre;


    String apellido;
    int edad;



    char genero;

    public void cargarAlumno() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno");
        this.setNombre(teclado.nextLine());
        System.out.println("Ingrese el apellido del alumno");
        this.setApellido(teclado.nextLine());
        System.out.println("Ingrese la edad del alumno");
        this.setEdad(Integer.parseInt(teclado.nextLine()));
        System.out.println("Ingrese M si es masculino o F si es femenino");
        this.setGenero(teclado.next().charAt(0));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
    public void mostrarAlumno() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Edad: " + this.edad);
        System.out.println("Genero: " + this.genero);
    }
}