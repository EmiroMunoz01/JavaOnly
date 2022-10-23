package e.e1;
// A partir de una variable num1 con valor inicial 12 y una variable num2 con valor inicial 4, crear nuevas variables que almacenen el resultado de realizar la suma, resta, multiplicación, división y resto de num1 y num2. Mostrar el valor de las nuevas variables por pantalla.

public class Main {

    public static void main(String[] args) {
        int n1 = 12;
        int n2 = 4;

        int[] variables = {
                n1 + n2,
                n1 - n2,
                n1 * n2,
                n1 / n2
        };

        for (int i = 0; i <= 3; i++) {
            System.out.println("El valor de n[" + i + "]" + " es de: " + variables[i]);
        }

    }
}
