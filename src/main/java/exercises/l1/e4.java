package exercises.l1;


//crear un programa que calcule el promedio de 4 numeros

import java.util.Scanner;

public class e4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int e = (a + b + c + d) / 4;

        System.out.println(e);
    }
}
