package poo.aritmetica;

public class Main {
    public static void main(String[] args) {

        Aritmetica op1 = new Aritmetica();
        op1.a = 2;
        op1.b = 3;
        op1.sumar();

        System.out.println(op1.sumarConRetorno());

        System.out.println(op1.sumarConArgumentos(2, 2));

    }
}
