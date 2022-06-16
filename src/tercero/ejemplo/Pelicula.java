package tercero.ejemplo;

import java.util.Scanner;

public class Pelicula {
    String nombre;
    String genero;
    int duracion;


    public void cargarPelicula() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la pelicula");
        this.setNombre(teclado.nextLine());
        System.out.println("Ingrese el genero de la pelicula");
        this.setGenero(teclado.nextLine());
        System.out.println("Ingrese la duracion de la pelicula");
        this.setDuracion(teclado.nextInt());
    }

    public void mostrarPelicula() {
        System.out.println("Titulo: "+this.nombre);
        System.out.println("Genero: "+this.genero);
        System.out.println("Duracion: "+this.duracion+" min.");
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
