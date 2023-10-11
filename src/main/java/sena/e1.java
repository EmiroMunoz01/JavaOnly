package sena;

import java.util.Scanner;

public class e1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double valorarea;
        double valorperimetro;
        double valorvolumen;

        System.out.print("\n¿Su figura tiene lados?: \n1.Si \n2.No\n");
        int base = entrada.nextInt();

        if (base == 1) {
            System.out.println(
                    "Su figura tiene lados. Ahora determine si su figura es plana (2d) o tridimencional (3d). Escriba 2d o 3d segun corresponda");
            int dimension = entrada.nextInt();
            if (dimension == 1) {
                System.out.println("Su figura es en 2d, ahora escriba el numero de lados de la figura: ");
                int lados = entrada.nextInt();
                if (lados < 3) {
                    System.out.println(
                            "Tienes un error, la figura no puede tener menos de 3 lados, vuelve a intentarlo.");
                } else {
                    System.out.println("Ingresa las dimensiones de tu figura: ");

                    double[] medidas = new double[lados];
                    for (int i = 1; i <= lados; i++) {
                        System.out.println("Ingrese el valor del lado" + i);
                        double medida = entrada.nextDouble();

                    }

                }
            }
        } else if (base == 2) {
            System.out.println(
                    "Su figura no tiene lados, entonces es un circulo. Ahora determine si su figura es plana (2d) escriba el número 1 o si es tridimencional (3d) escriba el número 2:");
            int plano = entrada.nextInt();
            if (plano == 1) {
                System.out.println("Su figura es en 2d");
                System.out.println("========================");
                System.out.println("Con este software calcularemos el area y perimetro del circulo");
                System.out.println("========================");

                System.out.println("Ingrese el valor del radio del circulo");
                int radio = entrada.nextInt();
                valorarea = (radio * radio) * 3.1416;
                valorperimetro = 2 * 3.1416 * radio;

                System.out.println("El area del circulo es de: " + valorarea);
                System.out.println("El perimetro del circulo es de: " + valorperimetro);

            } else if (plano == 2) {
                System.out.println("Su figura es en 3d");
                System.out.println("========================");
                System.out.println("Con este software calcularemos el volumen y area de una  esfera");
                System.out.println("========================");
                System.out.println("Ingrese el valor del radio del circulo");
                int radio = entrada.nextInt();

                valorarea = Math.pow(radio, 2) * 3.1416 * 4;
                valorvolumen = Math.pow(radio, 3) * 3.1416 * 4 / 3;

                System.out.println("El area de la esfera es de: " + valorarea);
                System.out.println("El volumen de la esfera es de: " + valorvolumen);
            }

        }

    }

}
