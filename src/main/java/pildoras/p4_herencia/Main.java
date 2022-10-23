package pildoras.p4_herencia;

public class Main {
    public static void main(String[] args) {
        Vehiculo automovil1 = new Vehiculo();

        Furgoneta furgoneta1 = new Furgoneta(1000, 3);

        furgoneta1.setColor("Blue");
        furgoneta1.setDoors(6);

        System.out.println(automovil1.generateDataVehicle());

        System.out.println(furgoneta1.generateDataVehicle() + ". " + furgoneta1.dimeDatosFurgoneta());

    }
}
