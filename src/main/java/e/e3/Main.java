package e.e3;
//Construir un programa que dado el peso (en kilogramos) y la altura de una persona (en metros) calcule y muestre por pantalla su Indice de Masa Corporal (IMS) o índice de Quetelet. Este índice pretende determinar el intervalo de peso más saludable que puede tener una persona. El valor de este índice se calcula mediante la siguiente expresión:

// IMS = peso/altura2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);

        System.out.print("Ingrese cuantos kilos pesa: ");
        int kilos = dato.nextInt();

        System.out.print("Ingrese cuantos centimetros mide: ");
        double altura = dato.nextDouble() / 100;

        double imc = kilos / Math.pow(altura, 2);

        System.out.println("Su indice de masa corporal es de: " + Math.round(imc));

        if ((imc >= 18) && (imc <= 25)) {
            System.out.println("Su IMC es saludable");
        } else {
            System.out.println("¡Cuidado!");
        }
    }
}
