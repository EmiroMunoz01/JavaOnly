package temas.sobrecargaConstructor.Caja;

public class Caja {
    private double base;
    private double ancho;
    private double altura;
    private String tipoCaja;

    public Caja() {
        this.base = 0;
        this.ancho = 0;
        this.altura = 0;
        
    }

    public Caja(double base, double ancho, double altura) {
        this.base = base;
        this.ancho = ancho;
        this.altura = altura;
    }

    

    public Caja(double longitud) {
        this.base = longitud;
        this.ancho = longitud;
        this.altura = longitud;
    }

    public Caja(double base, double ancho, double altura, String tipoCaja) {
        this(base, ancho, altura);
        this.tipoCaja = tipoCaja;
    }

}
