package poo.Banco;

public class CuentaBancaria {
    String nombresTitular;
    String apellidosTitular;
    int num_cuenta;
    enum tipo{
        AHORROS, CORRIENTE
    }
    tipo tipoCuenta;
    float saldo = 0;
    boolean estado;


    public CuentaBancaria(String nombresTitular, String apellidosTitular, int num_cuenta, tipo tipoCuenta) {
        this.nombresTitular = nombresTitular;
        this.apellidosTitular = apellidosTitular;
        this.num_cuenta = num_cuenta;
        this.tipoCuenta = tipoCuenta;
    }

    // metodo que imprimira los datos de una cuenta bancaria

    void imprimir() {

        System.out.println("“Nombres del titular = "+ nombresTitular);
        System.out.println("Apellidos del titular = "+ apellidosTitular);
        System.out.println("Número de cuenta = "+ num_cuenta);
        System.out.println("Tipo de cuenta = "+ tipoCuenta);
        System.out.println("Saldo = "+saldo);
    }

    //metodo que imprime el saldo actual de una cuenta bancaria

    void consultarSaldo(){
        System.out.println("El saldo actual es = "+saldo);
    }

    //añadiremos un metodo que actualice y devuelva el valor de una cuenta bancaria a partir de un valor a consignar. El valor debe ser mayor a 0

    boolean consignar(int valor){

        if(valor > 0){
            saldo = saldo + valor;
            System.out.println("Se ha consignado $"+valor+" en la cuenta. El nuevo saldo es $" + saldo);
            return true;
        }
        else{
            System.out.println("El valor a consignar debe ser mayor a $0");
            return false;
        }
    }


    //Con este metodo vamos a retirar dinero
    boolean retirar(int valor){
        //el valor debe ser mayor que cero y no debe superar el saldo actual

        if((valor > 0) && (valor <= saldo)){
            saldo = saldo - valor;
            System.out.println("Se ha retirado $"+valor+" en la cuenta. El nuevo saldo es $" + saldo);

            return true;
        }
        else{
            System.out.println("El valor a retirar debe ser menor o igual que el saldo actual");
            return false;
        }

    }
    /**
    * Método que compara los saldos de dos cuentas bancarias y
    * muestra el resultado en pantalla
    * @param cuenta Parámetro que define otra cuenta bancaria con la
    * cual se va a comparar la cuenta bancaria actual
    */
    void compararCuentas(CuentaBancaria cuenta){
        /* Determina si el saldo de la cuenta actual es mayor o igual que
        el saldo de la otra cuenta */
        if(saldo >= cuenta.saldo){
            System.out.println("“El saldo de la cuenta actual es mayor o igual al saldo de la cuenta pasada como parámetro.");
        }
        else{
            System.out.println("El saldo de la cuenta actual es menor al saldo de la cuenta pasada como parámetro.");
        }

    }
    /**
    * Método que transfiere un valor de una cuenta a otra
    * @param cuenta Parámetro que define otra cuenta bancaria a la
    * cual se le va a transferir un valor
    * @param valor Parámetro que define el valor a transferir
    */

    void transferencia(CuentaBancaria cuenta, int valor) {
        if (retirar(valor)) { 
        // Si se puede retirar el valor de la cuenta actual
        cuenta.consignar(valor); 
        /* Se realiza la consignación en la
        otra cuenta */
        }
    }

    boolean estado(){

        if (saldo > 0){
            System.out.println("La cuenta esta activa");
            return true;
        }
        else{
            System.out.println("La cuenta esta inactiva");
            return false;
        }
    }
}
