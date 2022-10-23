package temas.sobrecargaMetodos.suma;

public class Suma {
    public void calcularSuma(int n1, int n2) {
        double suma = n1 + n2;
        System.out.println("El valor de la suma es: " + suma);
    }

    public void calcularSuma(int n1, int n2, int n3) {
        double suma = n1 + n2 + n3;
        System.out.println("El valor de la suma es: " + suma);
    }

    public void calcularSuma(int n1, int n2, int n3, int n4) {
        double suma = n1 + n2 + n3 + n4;
        System.out.println("El valor de la suma es: " + suma);
    }
}
