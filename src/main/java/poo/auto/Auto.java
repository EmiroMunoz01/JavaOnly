package poo.auto;

public class Auto {
    
    String marca;
    int modelo;
    int motor;
    enum tipoCom{
        GASOLINA, BIOETANOL, DIÉSEL, BIODISEL, GAS, DIESEL
    }
    tipoCom tipoCombustible;

    enum tipoA{
        URBANO, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV
    }
    tipoA tipoAuto;

    int puertas;
    int asientos;
    int velocidadMax;

    enum tipoCol{
        BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA
    }
    tipoCol tipoColor;

    int velocidadActual = 0;

    public Auto(String marca, int modelo, int motor, tipoCom tipoCombustible, tipoA tipoAuto, int puertas, int asientos, int velocidadMax, tipoCol tipoColor , int velocidadActual){

        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAuto = tipoAuto;
        this.puertas = puertas;
        this.asientos = asientos;
        this.velocidadMax = velocidadMax;
        this.tipoColor = tipoColor;
        this.velocidadActual = velocidadActual;

    }

    String getMarca() {
        return marca;
    }

    int getModelo() {
        return modelo;
    }

    int getMotor(){
        return motor;
    }

    tipoCom getTipoCombustible(){
        return tipoCombustible;
    }

    tipoA getTipoAuto(){
        return tipoAuto;
    }

    
    int getNúmeroPuertas() {
        return puertas;
    }
    int getCantidadAsientos() {
        return asientos;
    }

    int getVelocidadMáxima() {
        return velocidadMax;
    }

    tipoCol getColor() {
        return tipoColor;

    }
    
    int getVelocidadActual() {
        return velocidadActual;
    }

    void setMarca(String marca) {
        this.marca = marca;
    }

    void setModelo(int modelo) {
        this.modelo = modelo;
    }

    void setMotor(int motor) {
        this.motor = motor;
    }

    void setTipoCombustible(tipoCom tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    void setTipoAuto(tipoA tipoAuto) {
        this.tipoAuto = tipoAuto;
    }

    void puertas(int puertas) {
        this.puertas = puertas;
    }

    void setAsientos(int asientos) {
        this.asientos = asientos;
        
    }

    void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    void setColor(tipoCol tipoColor) {
        this.tipoColor = tipoColor;
    }

    void acelerar(int incrementoVelocidad) {

        if (velocidadActual + incrementoVelocidad < velocidadMax) {
        /* Si el incremento de velocidad no supera la velocidad
        máxima */
        velocidadActual = velocidadActual + incrementoVelocidad;
        } 
        else { /* De otra manera no se puede incrementar la velocidad y
        se genera mensaje */
        System.out.println("No se puede incrementar a una velocidad superior a la máxima del automóvil.");
        }
    }

    void desacelerar(int decrementoVelocidad) {
        /* La velocidad actual no se puede decrementar alcanzando un
        valor negativo */
        if ((velocidadActual - decrementoVelocidad) > 0) {
        velocidadActual = velocidadActual - decrementoVelocidad;
        } 

        else { /* De otra manera no se puede decrementar la velocidad y
        se genera mensaje */
        System.out.println("“No se puede decrementar a una velocidad negativa.");
        }
    }

    void frenar() {
        velocidadActual = 0;
    }

    double calcularTiempoLlegada(int distancia) {
        return distancia/velocidadActual;
    }

    public void imprimir(){
        System.out.println("Marca = " + marca);
        System.out.println("Modelo = " + modelo);
        System.out.println("Motor = " + motor);
        System.out.println("Tipo de combustible = " + tipoCombustible);
        System.out.println("Tipo de automóvil = " + tipoAuto);
        System.out.println("Número de puertas = " + puertas);
        System.out.println("Cantidad de asientos = " + asientos);
        System.out.println("Velocida máxima = " + velocidadMax);
        System.out.println("Color = " + tipoColor);
    }
}
