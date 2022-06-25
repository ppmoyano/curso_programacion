package tercero.ejercicio4;

import java.util.Scanner;

public class Profesor extends SerHumano{
    public void cargarProfesor() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre del profesor:");
        this.nombre = teclado.next();
        System.out.println("Ingrese el apellido del profesor:");
        this.apellido = teclado.next();
        System.out.println("Ingrese la especialidad: 1 - Ciencias Naturales 2- Ciencias Sociales");
        this.especialidad = teclado.nextInt();
        System.out.println("PROFESOR "+this.apellido+" REGISTRADO");
    }

}
