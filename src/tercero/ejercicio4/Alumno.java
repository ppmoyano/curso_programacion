package tercero.ejercicio4;

import java.util.Scanner;

public class Alumno extends SerHumano{
    int edad;
    int tutor;

    public void cargarAlumno(Profesor[] profesores) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno:");
        this.nombre = teclado.next();
        System.out.println("Ingrese el apellido del alumno:");
        this.apellido = teclado.next();
        System.out.println("Ingrese la edad del alumno:");
        this.edad = teclado.nextInt();
        System.out.println("Ingrese la especialidad: 1 - Ciencias Naturales 2- Ciencias Sociales");
        this.especialidad = teclado.nextInt();
        Profesor[] profesoresDeEspecialidad = obtenerProfesoresSegundEspecialidad(profesores, this.especialidad);
        System.out.println("Seleccione el tutor: 1- Profesor "+profesoresDeEspecialidad[0].apellido +" 2- Profesor "+profesoresDeEspecialidad[1].apellido);
        this.tutor = teclado.nextInt();
        System.out.println("ALUMNO "+this.apellido+" REGISTRADO");
    }

    private Profesor[] obtenerProfesoresSegundEspecialidad(Profesor[] profesores, int especialidad) {
        Profesor[] profesoresEspecialidad = new Profesor[2];
        int contador = 0;
        for (int i=0; i < profesores.length; i++) {
            if ( profesores[i].especialidad == especialidad) {
                profesoresEspecialidad[contador] = profesores[i];
                contador++;
            }
        }
        return profesoresEspecialidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTutor() {
        return tutor;
    }

    public void setTutor(int tutor) {
        this.tutor = tutor;
    }
}
