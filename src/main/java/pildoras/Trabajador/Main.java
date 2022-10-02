package pildoras.Trabajador;

public class Main {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Santiago", 1200, 2020, 5, 5);

        Empleado empleado2 = new Empleado("Jose", 1000, 2020, 12, 5);

        Empleado empleado3 = new Empleado("Carlos", 500, 2020, 8, 15);

        empleado1.upSalary(10);
        System.out.println(empleado1.getSalary() + " " + empleado1.getExitDate());
    }
}
