package poo.aritmetica;

public class Aritmetica {

    int a;
    int b;

    public void sumar() {
        int resultado = a + b;
        System.out.println("Resultado = " + resultado);
    }


    // sumaremos con argumentos
    public int sumarConArgumentos(int valorA, int valorB) {
        return valorA + valorB;
    }

}
