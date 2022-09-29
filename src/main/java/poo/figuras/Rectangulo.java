package poo.figuras;

public class Rectangulo {
    int base;
    int altura;


    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    int calcularArea() {
        return base * altura;
    
    }

    int calcularPerímetro() {
        return (2 * base) + (2 * altura);
    }
}
