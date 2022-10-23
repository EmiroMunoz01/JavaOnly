package temas.sobrecargaMetodos.suma;

public class Main {
    public static void main(String[] args) {
        Suma suma1 = new Suma();
        suma1.calcularSuma(2, 3);

        Suma suma2 = new Suma();
        suma2.calcularSuma(2, 4, 6);

        Suma suma3 = new Suma();
        suma3.calcularSuma(2, 2, 2, 2);
    }
}
