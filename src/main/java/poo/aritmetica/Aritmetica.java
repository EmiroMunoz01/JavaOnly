package poo.aritmetica;

public class Aritmetica {
    int a;
    int b;

    public void sumar() {
        int resultado = a + b;
        System.out.println("Resultado = " + resultado);
    }

    // esta es otra forma de declarar la suma
    public int sumarConRetorno() {
        return a + b;
    }

    // sumaremos con argumentos

    public int sumarConArgumentos(int arg1, int arg2) {
        a = arg1;
        b = arg2;
        return a + b;
    }

}
