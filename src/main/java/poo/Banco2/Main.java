package poo.Banco2;

public class Main {
    public static void main(String[] args) {


        CuentaBancaria cuenta1 = new CuentaBancaria("Emiro", "Rojas", 123456, CuentaBancaria.tipo.AHORROS);


        cuenta1.imprimir();
        System.out.println("---------------");


        cuenta1.depositar(2000);

        cuenta1.imprimir();
    }
}
