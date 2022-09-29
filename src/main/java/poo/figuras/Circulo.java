package poo.figuras;

public class Circulo {
    double radio;


    public Circulo(double radio) {
        this.radio = radio;
    }

    double calcularArea() {
        return Math.PI*Math.pow(radio,2);
    }

    double calcularPerímetro() {
        return 2*Math.PI*radio;
    }
}
