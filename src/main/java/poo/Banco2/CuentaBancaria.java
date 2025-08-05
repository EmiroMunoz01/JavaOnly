package poo.Banco2;

public class CuentaBancaria {

    String nombre;
    String apellido;
    int numero_cuenta;

    enum tipo{
        AHORROS, CORRIENTE
    }

    float saldo;

    tipo tipo_cuenta;

       public CuentaBancaria(String nombre, String apellido, int numero_cuenta, tipo tipo_cuenta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero_cuenta = numero_cuenta;
        this.tipo_cuenta = tipo_cuenta;
    }


    void imprimir(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Numero Cuenta: " + numero_cuenta);
        System.out.println("Tipo: " + tipo_cuenta);
        System.out.println("Saldo: " + saldo);
   }

   boolean depositar(float valor){
           if (valor > 0){
               saldo = saldo + valor;
               return true;
           }else {
               System.out.println("Valor insuficiente");
               return false;
           }
   }


}
