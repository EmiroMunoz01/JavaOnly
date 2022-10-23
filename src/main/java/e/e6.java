package e;
import java.util.Scanner;
// se hallara el factorial de un numero
public class e6 {
    public static void main(String[] args) {
     
        Scanner dato = new Scanner(System.in);
        int numero = dato.nextInt();

        int factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
            

        }
        System.out.println(factorial);
    }
}
