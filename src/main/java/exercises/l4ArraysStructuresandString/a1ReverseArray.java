package exercises.l4ArraysStructuresandString;

import java.util.Scanner;

//Create a program to ask the user for 5 numbers, store them in an array and show them in reverse order.
public class a1ReverseArray {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int[] variables = new int[5];

        for (int i = 0; i < 5; i++) {

            System.out.println("Ingrese el valor #" + (i + 1));
            variables[i] = sc.nextInt();


        }


        for (int i = 0; i < 5; i++) {
            System.out.println("El valor #" + (i + 1) + " es: " + variables[i]);

        }
    }
}
