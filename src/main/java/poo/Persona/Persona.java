package poo.Persona;

public class Persona {
    String nombre;
    String apellido;

    //aqui tenemos un metodo que no devuelve valores, porque se lo indicamos por medio de la palabra void
    
    public void desplegarInformación() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);

    }
}
