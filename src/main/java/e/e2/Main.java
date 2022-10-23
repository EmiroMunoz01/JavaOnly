package e.e2;


// Construir un programa que, dado el radio de una esfera, calcule y devuelva por pantalla el valor de la superficie y el volumen de la esfera correspondiente. Para obtener el valor de PI, utilizar la variable estática Math.PI.

// Volumen esfera = (4/3)PIR3

// Superficie esfera = 4PIR2

public class Main {
    public static void main(String[] args) {
        int radio = 10;

        double volumen_esfera = Math.round(4/3*Math.PI*Math.pow(radio,3));
        double superficie_esfera = Math.round(4*Math.PI*Math.pow(radio,2));


        System.out.println("El volumen de la esfera es de: " + volumen_esfera);
        System.out.println("La superficie de la esfera es de: " + superficie_esfera);
        

    }
}
