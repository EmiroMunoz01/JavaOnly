package exercises.l1;


import java.util.Scanner;

//recibir 3 numeros y multiplicarlos entre si
public class e1 {

    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);

        int number1, number2, number3;

        System.out.println("Ingrese el primer numero: ");
        number1 = dato.nextInt();


        System.out.println("Ingrese el segundo numero: ");
        number2 = dato.nextInt();

        System.out.println("Ingrese el tercer numero: ");
        number3 = dato.nextInt();

        int result = number1 * number2 * number3;

        System.out.println("El resultado de la multiplicacion es de: " + result);

    }
}
