package pildoras.p1_constantes;

public class Pruebas {
    // aquí nunca se podra modificar el nombre del usuario
    private final String nombre;
    private String seccion;

    public Pruebas(String nombre) {
        this.nombre = nombre;
        seccion = "Administration";
    }

    public String getSeccion() {
        return this.seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String devuelveDatos() {
        return "El nombre es: " + nombre + " y la sección es " + seccion;
    }

    public String getNombre() {
        return this.nombre;
    }

}
