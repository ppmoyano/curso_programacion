package tercero.ejemplo;

import java.util.Scanner;

public class ejemplo {

    public static void main(String[] args) {
        /*
        App para VideClub - queremos guardar las peliculas con su Nombre Genero y Duracion. Stock 5 peliculas.

        Pelicula Nombre     Genero    Duracion
        1        La Roca    Accion    190
        2        Titanic    Drama     300
        3        SuperMan   Accion    130
        4        SpaceJam   Dibujo    60
        5        La Mascara Fantasia  120

        String[][][][]
        */
       Scanner teclado = new Scanner(System.in);
       Pelicula[] peliculas = new Pelicula[3];
        for (int i=0;i<3;i++){
            peliculas[i] = new Pelicula();
            peliculas[i].cargarPelicula();
        }
        for (int i=0;i<3;i++){
            peliculas[i].mostrarPelicula();
        }

    }
}


