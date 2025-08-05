package poo.lapiz;
import poo.lapiz.Lapiz.tipoForma;

public class Main {
    public static void main(String[] args) {

        Lapiz lapiz1 = new Lapiz("Fabercastell", 100, "azul", tipoForma.CIRCULAR);

        lapiz1.imprimir();
        lapiz1.afilar(20);
        lapiz1.afilar(20);
        lapiz1.afilar(50);
        lapiz1.afilar(20);

    }
}
