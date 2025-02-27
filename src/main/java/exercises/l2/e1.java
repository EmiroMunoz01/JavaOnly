package exercises.l2;
//ingrese un numero y determinar si es positivo o negativo

import java.util.Scanner;

public class e1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int a = sc.nextInt();

        if (a < 0) {
            System.out.println("El numero " + a + " es negativo");
        } else {
            System.out.println("El numero " + a + " es positivo");
        }

    }
}
