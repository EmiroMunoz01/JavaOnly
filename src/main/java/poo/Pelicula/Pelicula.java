package poo.Pelicula;

public class Pelicula {

    private String nombre;
    String director;

    public enum tipo{
        ACCION, COMEDIA, DRAMA, SUSPENSO
    }
    
    tipo tipoGenero;
    
    private int duracion;
    private int año;
    private double calificacion;


    public Pelicula(String nombre, String director, tipo tipoGenero, int duracion, int año, double calificacion) {
        this.nombre = nombre;
        this.director = director;
        this.tipoGenero = tipoGenero;
        this.duracion = duracion;
        this.año = año;
        this.calificacion = calificacion;
    }


    public String getNombre() {
        return this.nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return this.director;
    }

    private void setDirector(String director) {
        this.director = director;
    }

    public tipo getTipoGenero() {
        return this.tipoGenero;
    }

    private void setTipoGenero(tipo tipoGenero) {
        this.tipoGenero = tipoGenero;
    }

    public int getDuracion() {
        return this.duracion;
    }

    private void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAño() {
        return this.año;
    }

    private void setAño(int año) {
        this.año = año;
    }

    public double getCalificacion() {
        return this.calificacion;
    }

    private void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public void imprimir(){
        System.out.println("El nombre de la pelicula es: "+nombre);
        System.out.println("El nombre del director de la pelicula es: "+director);
        System.out.println("El genero de la pelicula es: "+tipoGenero);
        System.out.println("La pelicula dura: "+duracion+" horas");
        System.out.println("La pelicula es del año: "+año);
        System.out.println("La calificación de la pelicula es: "+duracion);
    }

    boolean esPeliculaEpica(){
        if(duracion >= 180){
            System.out.println("La pelicula es epica");
            return true;

        }
        else{
            System.out.println("La pelicula NO es epica");
            return false;
        }
    }

    private String calcularValoracion(){

        if ((calificacion >= 0) && (calificacion <= 2)){
            return "La pelicula es muy mala";
        }
        else if((calificacion > 2) && (calificacion <= 5)){
            return "La pelicula es mala";
        
        }
        else if((calificacion > 5) && (calificacion <= 7)){
            return "La pelicula es Regular";


        }
        else if((calificacion > 7) && (calificacion <= 8)){
            return "La pelicula es Buena";


        }
        else{
            return "La pelicula es Excelente";
        }
    }
    boolean esSimilar(Pelicula pelicula){
        if (pelicula.tipoGenero == tipoGenero && pelicula.calcularValoracion() == calcularValoracion()) {
                return true;
        } 
        else {
            return false;
        }
    }
}
