package exercises.l1;
//Write a Java program to ask the user for three numbers (a, b, c) and display the result of (a+b)·c and the result of a·c + b·c


import java.util.Scanner;

public class e5 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int d = (a + b) * c;

        int e = (a * c) + (b * c);

        System.out.println(d);
        System.out.println(e);
    }

}
