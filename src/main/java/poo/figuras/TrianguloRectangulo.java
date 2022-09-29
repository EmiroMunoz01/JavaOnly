package poo.figuras;

public class TrianguloRectangulo {
    double base;
    double altura;


    public TrianguloRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    double calcularArea() {
        return (base * altura / 2);
    }

    double calcularHipotenusa() {
        return Math.pow(base*base + altura*altura, 0.5);
    }

    double calcularPerímetro() {
        return (base + altura + calcularHipotenusa()); /* Invoca al
        método calcular hipotenusa */
    }

    void determinarTipoTriángulo() {
        if ((base == altura) && (base == calcularHipotenusa()) && (altura== calcularHipotenusa())){
        System.out.println("Es un triángulo equilátero");} /* Todos sus
        lados son iguales */
        else if ((base != altura) && (base != calcularHipotenusa()) &&
        (altura != calcularHipotenusa())){
        System.out.println("Es un triángulo escaleno");} /* Todos sus lados son  diferentes */
        else{
        System.out.println("Es un triángulo isósceles"); /* De otra
        manera, es isósceles */
        }
    }
    
}
