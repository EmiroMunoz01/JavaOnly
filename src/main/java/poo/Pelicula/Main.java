package poo.Pelicula;

import poo.Pelicula.Pelicula.tipo;

public class Main {
    
    public static void main(String[] args) {

        Pelicula pelicula1 = new Pelicula("El señor de los anillos", "Emiro", tipo.COMEDIA,3, 2000, 9);

        Pelicula pelicula2 = new Pelicula("Thor", "Xd", tipo.ACCION, 150, 2001, 9);

        pelicula1.imprimir();
        System.out.println();
        pelicula2.imprimir();
        System.out.println();
        System.out.println("La película " + pelicula1.getNombre() + " es épica: " + pelicula1.esPeliculaEpica());
        System.out.println("La película " + pelicula2.getNombre() + " es épica: " + pelicula2.esPeliculaEpica());
        System.out.println("La película " + pelicula1.getNombre() + " y la película " + pelicula2.getNombre() + " son similares = " +
        pelicula1.esSimilar(pelicula2));




    }
}
