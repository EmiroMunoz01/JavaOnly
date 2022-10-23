package pildoras.p4_herencia;

public class Furgoneta extends Vehiculo {

    private int capacidadKilos;
    private int sillasAdicionales;

    public Furgoneta(int capacidadKilos, int sillasAdicionales) {
        super();
        this.capacidadKilos = capacidadKilos;
        this.sillasAdicionales = sillasAdicionales;
    }

    public int getCapacidadKilos() {
        return this.capacidadKilos;
    }

    public void setCapacidadKilos(int capacidadKilos) {
        this.capacidadKilos = capacidadKilos;
    }

    public int getSillasAdicionales() {
        return this.sillasAdicionales;
    }

    public void setSillasAdicionales(int sillasAdicionales) {
        this.sillasAdicionales = sillasAdicionales;
    }

    public String dimeDatosFurgoneta() {
        return "La capacidad de carga es: " + capacidadKilos + " y las sillas que tiene son: " + sillasAdicionales;
    }

}
