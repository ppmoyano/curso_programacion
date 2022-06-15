package tercero.ejercicio3a;

import java.util.Scanner;

/*
Aqui tenemos que agregar los campos necesarios y un metodo para mostrar la informacion del niño
*/
public class Persona {
    String nombre;
    String apellido;
    int edad;

    public void cargarAlumno() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre:");
        this.setNombre(teclado.nextLine());
        System.out.println("Ingrese el apellido:");
        this.setApellido(teclado.nextLine());
        System.out.println("Ingrese la edad:");
        this.setEdad(teclado.nextInt());
    }
    public void mostrarAlumno() {
        System.out.println("NIÑO REGISTRADO - "+ this.getNombre() + " " + this.getApellido() +" de " + this.getEdad() + " años de edad");
    }

    public void setNombre (String nombre) {this.nombre = nombre;}
    public void setApellido (String apellido) {this.apellido = apellido;}
    public void setEdad (int edad) {this.edad = edad;}

    public String getNombre () {return nombre;}
    public String getApellido () {return apellido;}
    public int getEdad () {return edad;}


    public boolean limiteEdad (int getEdad) {
        return (getEdad > 8);
        }



    }

