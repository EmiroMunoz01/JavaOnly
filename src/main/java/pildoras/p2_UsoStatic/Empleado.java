package pildoras.p2_UsoStatic;

public class Empleado {
    private final String nombre;
    private String seccion;

    //ahora crearemos un id automatico, aprovechando el Static
    private int Id;
    private static int IdSiguiente = 1;


    public Empleado(String nombre) {
        this.nombre = nombre;
        this.seccion = "Administración";
        this.Id = IdSiguiente;
        IdSiguiente++;
    }

    public String getNombre() {

        return nombre;
    }


    public String getSeccion() {

        return seccion;
    }

    public void setSeccion(String seccion) {

        this.seccion = seccion;
    }

    public String devolverDatos() {

        return "El nombre es: " + nombre + " y la sección es " + seccion + ". ID: " + Id;
    }
}
