package pildoras.p5_herencia_ii;

public class Empleado {
    private final String name;
    private double salary;

    public Empleado(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String datosEmpleado() {
        return "El nombre es: " + name + " y el salario: $" + salary;
    }
}
