package tercero.ejercicio3a;

import java.util.Scanner;

/*
Aqui tenemos que agregar los campos necesarios y un metodo para mostrar la informacion del niño
*/
public class Persona {
    String nombre;
    String apellido;
    int edad;
    public void cargarPersona() {
          Scanner teclado = new Scanner(System.in);
                System.out.println("Ingrese el nombre del alumno");
                this.setNombre(teclado.nextLine());
                System.out.println("Ingrese el apellido del alumno");
                this.setApellido(teclado.nextLine());
                System.out.println("Ingrese la edad del alumno");
                this.setEdad(Integer.parseInt(teclado.nextLine()));

    }


    public void mostrarPersona() {
        System.out.println("alumno: "+ this.nombre + " " + this.apellido);
        System.out.println("tiene: "+this.edad + "años");}
    public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getNombre() {
           return nombre;
        }
    public void setApellido (String apellido) {
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