package temas.stringsWrapper.atleta;

public class Atleta {
    private static int contador = 0;
    private int identificador;
    private String nombre;
    private double tiempo;
    private static String seleccion = "Colombia";
    private static double tiempoEquipo;

    public Atleta(String nombre, double tiempo) {
        contador++;
        identificador = contador;
        this.nombre = nombre;
        this.tiempo = tiempo;

    }

    public void correr400metros() {
        tiempoEquipo = tiempoEquipo + tiempo;
    }

    public void imprimir() {
        System.out.println("*******************");
        System.out.println("Identificador del atleta = " + identificador);
        System.out.println("Nombre del atleta = " + nombre);
        System.out.println("Tiempo del atleta = " + tiempo + " segundos");
        System.out.println("*******************");
    }

    public static void imprimirSeleccion() {
        System.out.println("Seleccion = " + seleccion);
    }

    public static void imprimirTiempoEquipo() {
        System.out.println("*******************");
        System.out.println("Tiempo del equipo = " + tiempoEquipo + " segundos");
        System.out.println("*******************");
    }

}
