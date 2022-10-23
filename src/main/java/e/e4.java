package e;
//Definir dos variables num1 y num2 e implementar un programa que asigne un valor a cada una, y obtenga el mayor de los dos, mostrando el resultado por pantalla.
import java.util.Scanner;
public class e4 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int n1 = dato.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int n2 = dato.nextInt();

        if (n1 < n2) {
            System.out.println("El numero mayor es " + n2);
        } else {
            System.out.println("El numero mayor es " + n1);
        }
    }
}
