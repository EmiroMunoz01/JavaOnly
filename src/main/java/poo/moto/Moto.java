package poo.moto;

public class Moto {
    String marca;
    int modelo;
    int velocidadMax;
    int velocidadActual = 0;

    enum tipoCom{
        GASOLINA, BIOETANOL, DIÉSEL, BIODISEL, GAS, DIESEL
    }
    tipoCom tipoCombustible;

    public Moto (String marca, int modelo, int velocidadMax, int velocidadActual, tipoCom tipoCombustible){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMax = velocidadMax;
        this.tipoCombustible = tipoCombustible;
    }

    String getMarca() {
        return marca;
    }

    int getModelo() {
        return modelo;
    }

    int getVelocidadMáxima() {
        return velocidadMax;
    }

    tipoCom getTipoCombustible(){
        return tipoCombustible;
    }

    void setMarca(String marca) {
        this.marca = marca;
    }

    void setModelo(int modelo) {
        this.modelo = modelo;
    }

    void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    void setTipoCombustible(tipoCom tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    void setVelocidadActual(int velocidadActual){
        this.velocidadActual = velocidadActual;

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
        System.out.println("No se puede decrementar a una velocidad negativa.");
        }
    }

    void frenar() {
        velocidadActual = 0;
    }

    double calcularTiempoLlegada(int distancia) {
        return distancia/velocidadActual;
    }

    void imprimir(){
        System.out.println("Marca = " + marca);
        System.out.println("Modelo = " + modelo);
        System.out.println("Tipo de combustible = " + tipoCombustible);

    }
}
