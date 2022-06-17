package tercero.ejercicio3a;

import java.util.Scanner;

/*
Aqui tenemos que agregar los campos necesarios y un metodo para mostrar la informacion del niño
*/
public class Alumno {
    String nombre;

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

    String apellido;
    int edad;
    public void cargarAlumno () {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno");
        this.setNombre(teclado.nextLine());
        System.out.println("Ingrese el apellido del alumno");
        this.setApellido(teclado.nextLine());
        System.out.println("Ingrese la edad del alumno");
        this.setEdad(Integer.parseInt(teclado.nextLine()));


      public void mostrarAlumno() {
            System.out.println("Nombre: "+this.nombre);
            System.out.println("Apellido: "+this.apellido);
            System.out.println("Edad: "+this.edad);

        }













}
