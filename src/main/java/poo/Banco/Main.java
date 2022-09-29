package poo.Banco;

import poo.Banco.CuentaBancaria.tipo;

public class Main {
    public static void main(String[] args) {
        
        CuentaBancaria cuenta1 = new CuentaBancaria("Pedro", "Pérez", 123456789, tipo.AHORROS);

        CuentaBancaria cuenta2 = new CuentaBancaria("Emiro","Muñoz", 987654321, tipo.AHORROS);

        cuenta1.consignar(2000);
        cuenta2.consignar(6000);
        cuenta1.compararCuentas(cuenta2);
        cuenta1.transferencia(cuenta2, 2000);
        cuenta1.consultarSaldo();
        cuenta2.consultarSaldo();
        cuenta1.estado();


    }
}
