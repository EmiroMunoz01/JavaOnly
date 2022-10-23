package udemy.u1_herencia;

public class Empleado extends Persona{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;


    public Empleado(String nombre, double sueldo) {
        super(nombre);
        this.idEmpleado = ++contadorEmpleado;
        this.sueldo = sueldo;
    }


}
