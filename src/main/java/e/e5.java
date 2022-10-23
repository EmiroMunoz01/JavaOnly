//Construir un programa que simule el funcionamiento de una calculadora que puede realizar las cuatro operaciones aritméticas básicas (suma, resta, producto y división) con valores numéricos enteros. El usuario debe especificar la operación con el primer carácter del primer parámetro de la línea de comandos: S o s para la suma, R o r para la resta, P, p, M o m para el producto y D o d para la división. Los valores de los operandos se deben indicar en el segundo y tercer parámetros.

package e;

import java.util.Scanner;

public class e5 {
    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int n1 = dato.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int n2 = dato.nextInt();

        System.out.println(
                "\nTenemos la siguiente convención; \n* 1 para suma\n* 2 para resta\n* 3 para multiplicación\n* 4 para división");

        System.out.print("Ingrese el numero de la operacion: ");
        int operacion = dato.nextInt();

        if (operacion == 1){
            System.out.println("Se realizara la suma de los dos numeros");
            System.out.println(n1 + n2);

        }
        else if (operacion ==2){
            System.out.println("Se realizara la resta de los dos numeros");
            System.out.println(n1 - n2);

        }
        else if (operacion ==2){
            System.out.println("Se realizara la multiplicacion de los dos numeros");
            System.out.println(n1 * n2);

        }
        else if (operacion ==2){
            System.out.println("Se realizara la division de los dos numeros");
            System.out.println(n1 / n2);

        }else{
            System.out.println("Esta opción no existe");
        }

    }
}
