package tercero.ejercicio4;

import java.util.Scanner;

/*
Queremos registrar los alumnos del ciclo de especializaciones.
Se registra el nombre, apellido, la edad y la especialidad elegida que puede ser "CIENCIAS NATURALES" o "CIENCIAS SOCIALES"
Dentro de cada especialidad hay dos profesores, pero solo uno va a ser el tutor del alumno. Tiene que elegir que profesor sera
el tutor. (Para esto primero vamos a tener que cargar los cuatro profesores).
 */
public class Main {

    public static void main(String[] args) {
       int cantidadDeProfesores = ingreseLaCantidadDeProfesores();
       int cantidadDeAlumnos = ingreseLaCantidadDeAlumnos();

       Profesor[] profesores = new Profesor[cantidadDeProfesores];
       Alumno[] alumnos = new Alumno[cantidadDeAlumnos];

       cargarProfesores(profesores);
       cargarAlumnos(alumnos, profesores);
    }

    private static void cargarAlumnos(Alumno[] alumnos, Profesor[] profesores) {
        for (int i=0; i < alumnos.length; i++) {
            alumnos[i] = new Alumno();
            alumnos[i].cargarAlumno(profesores);
        }
    }

    private static void cargarProfesores(Profesor[] profesores) {
        for (int i=0; i<profesores.length ; i++) {
            profesores[i] = new Profesor();
            profesores[i].cargarProfesor();
        }
    }

    private static int ingreseLaCantidadDeAlumnos() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantos alumnos desea ingresar?");
        return teclado.nextInt();
    }

    private static int ingreseLaCantidadDeProfesores() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantos profesores desea ingresar?");
        return teclado.nextInt();
    }

}

/*
EJEMPLO DE EJECUCION 1:
Cargando profesores...
Ingrese nombre de profesor:
Alberto
Ingrese apellido de profesor:
Gimenez
Ingrese especialidad 1- Ciencias Naturales 2- Ciencias Sociales
1
PROFESOR GIMENEZ REGISTRADO
Ingrese nombre de profesor:
Estela
Ingrese apellido de profesor:
Pavan
Ingrese especialidad 1- Ciencias Naturales 2- Ciencias Sociales
1
PROFESOR PAVAN REGISTRADO
Ingrese nombre de profesor:
Daniel
Ingrese apellido de profesor:
Soza
Ingrese especialidad 1- Ciencias Naturales 2- Ciencias Sociales
2
PROFESOR SOZA REGISTRADO
Ingrese nombre de profesor:
Francisco
Ingrese apellido de profesor:
Toro
Ingrese especialidad 1- Ciencias Naturales 2- Ciencias Sociales
2
PROFESOR Toro REGISTRADO
Registando alumnos...
Ingrese nombre del alumno:
Damian
Ingrese el apellido:
Cordoba
Ingrese la edad:
16
Ingrese especialidad 1- Ciencias Naturales 2- Ciencias Sociales
1
Seleccione el tutor: 1- Profesor Pavan 2- Profesor Giemenez
1
Se ha registado el alumno Damian Cordoba en la especialidad de Ciencias Sociales. Su tutor es el profesor Gimenez.
 */