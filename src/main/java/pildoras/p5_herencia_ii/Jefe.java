package pildoras.p5_herencia_ii;

public class Jefe extends Empleado {

    public Jefe(String name, double salary) {
        super(name, salary);
    }

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }
 
    public double dameSueldo() {
        double sueldoJefe = super.getSalary();
        return sueldoJefe + incentivo;
    }

    private double incentivo;

}
