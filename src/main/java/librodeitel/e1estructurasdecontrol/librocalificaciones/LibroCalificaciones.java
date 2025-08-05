package librodeitel.e1estructurasdecontrol.librocalificaciones;

import java.util.Scanner;

public class LibroCalificaciones {


    private String nombreLibro;
    private String nombreTitular;

    //constructor que nos permitira generar instancias
    public LibroCalificaciones(String nombre, String nombreTitular) {
        this.nombreLibro = nombre;
        this.nombreTitular = nombreTitular;
    }

    public void cambiarNombre(String nombre) {
        this.nombreLibro = nombre;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }


    public void imprimirDatosLibro() {
        System.out.println("Nombre del libro: " + nombreLibro);
        System.out.println("Nombre del titular: " + nombreTitular);
    }


    public Double promedioNotas() {


        Double[] calificaciones = new Double[3];
        Double sumaNotas = 0.0;
        Double promedioNotas=0.0;


        for (int i = 0; i < calificaciones.length; i++) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese la nota " + (i + 1) + " del libro: ");
            calificaciones[i] = sc.nextDouble();

            if (i == calificaciones.length - 1) {

                for (int j = 0; j < calificaciones.length; j++) {
                    sumaNotas = sumaNotas + calificaciones[j];

                }
                promedioNotas = sumaNotas / 3;

            }

        }

        System.out.println("El promedio de notas es: " + promedioNotas);

        return promedioNotas;
    }

}
