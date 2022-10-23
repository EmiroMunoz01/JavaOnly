package pildoras.p4_herencia;

public class Vehiculo {
    private String brand;
    private int engine;
    private int doors;
    private int year;
    private String color;

    public Vehiculo() {
        brand = "Toyota";
        engine = 4000;
        doors = 4;
        year = 2022;
        color = "Blanco";
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getEngine() {
        return this.engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public int getDoors() {
        return this.doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String generateDataVehicle() {
        return "El auto es de la marca " + brand + ", tiene " + doors + " puertas, es del año " + year + ", su color es: " + color + ", y tiene un motor de " + engine + " cc";
    }

}
