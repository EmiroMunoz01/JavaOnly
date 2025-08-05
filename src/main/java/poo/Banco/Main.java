package poo.Banco;

import poo.Banco.CuentaBancaria.tipo;

public class Main {
    public static void main(String[] args) {
        
        CuentaBancaria cuenta1 = new CuentaBancaria("Pedro", "Pérez", 111111, tipo.AHORROS);

        CuentaBancaria cuenta2 = new CuentaBancaria("Emiro","Muñoz", 222222, tipo.AHORROS);

        cuenta1.consignar(2000);
        cuenta2.consignar(6000);

        cuenta1.transferencia(cuenta2, 1000);

        System.out.println("-------------");
        cuenta1.consultarSaldo();
        cuenta2.consultarSaldo();



    }
}
