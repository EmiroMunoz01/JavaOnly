package libro1;

//ejercicio del IMC

import java.util.Scanner;

public class e1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su peso: ");
        int peso = sc.nextInt();

        System.out.println("Ingrese su altura");
        float altura = sc.nextFloat();

        float imc = peso / (altura * altura);

        System.out.println("El imc es: " + imc);

        if (imc < 16) {
            System.out.println("Delgadez severa");
        } else if (imc >= 16 && imc < 17) {
            System.out.println("Delgadez moderada");
        } else if (imc >= 17 && imc < 18.5) {
            System.out.println("Delgadez leve");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso normal");
        }

    }

}


