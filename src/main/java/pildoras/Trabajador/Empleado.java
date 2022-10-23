package pildoras.Trabajador;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {

    private final String name;
    private double salary;
    private int year;
    private int month;
    private int day;
    private Date exitDate;

    public Empleado(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.year = year;
        this.month = month;
        this.day = day;
        GregorianCalendar calendario = new GregorianCalendar(year, month - 1, day);
        this.exitDate = calendario.getTime();
    }

    public Empleado(String name) {
        //Aqui estamos usando los parametros del constructor de arriba
        this(name, 30000,2000,01,01);
    }


    public String getName() {

        return this.name;
    }


    public double getSalary() {

        return this.salary;
    }

    public void upSalary(double porcentaje) {
        double aumento = salary * porcentaje / 100;

        salary += aumento;

    }

    public Date getExitDate() {

        return this.exitDate;
    }

    public void setExitDate(Date exitDate) {
        this.exitDate = exitDate;
    }


}
