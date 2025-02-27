package exercises.l1;

//ingresar dos numeros y que se realicen todas las operaciones aritmeticas

import java.util.Scanner;

public class e2 {

    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        double numero = dato.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        double numero2 = dato.nextInt();

        double resultadoM = numero * numero2;
        double resultadoS = numero + numero2;
        double resultadoR = numero - numero2;
        double resultadoD = numero / numero2;

        System.out.println("El resultado de la multiplicacion es de: " + resultadoM);

        System.out.println("El resultado de la suma es de: " + resultadoS);

        System.out.println("El resultado de la resta es de: " + resultadoR);
        System.out.println("El resultado de la division es de: " + resultadoD);
    }
}
