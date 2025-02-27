package exercises.l1;

import java.util.Scanner;

public class e6 {


    public static void main(String[] args)
    {
        int n;
        System.out.println("Enter a digit: ");
        n = Integer.parseInt(new Scanner(System.in).nextLine());

        // Part A: "n n n n" using Write
        System.out.print(n);
        System.out.print(" ");
        System.out.print(n);
        System.out.print(" ");
        System.out.print(n);
        System.out.print(" ");
        System.out.print(n);
        System.out.println();

        // Part B: "nnnn" using Write
        System.out.print(n);
        System.out.print(n);
        System.out.print(n);
        System.out.println(n);
        System.out.println();

        // Part C: "n n n n" using {0}
        System.out.printf("%1$s %1$s %1$s %1$s" + "\r\n", n);

        // Part D: "nnnn" using {0}
        System.out.printf("%1$s%1$s%1$s%1$s" + "\r\n", n);
    }
}
