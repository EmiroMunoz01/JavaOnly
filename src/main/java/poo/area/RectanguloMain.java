package poo.area;
//1. trabajaremos primero con esta clase 
// llamada RectanguloMain
import java.util.Scanner;
public class RectanguloMain {
//escribiremos nuestro metodo main para indicar
//que esta va a ser la clase principal
    public static void main(String[] args) {   
        Scanner entrada = new Scanner(System.in);

        //solicitaremos los datos desde el
        //teclado

        System.out.print("Escriba la base: ");
        int base = entrada.nextInt();

        System.out.print("Escriba la altura: ");
        int altura = entrada.nextInt();

        //ahora crearemos el objeto para crear
        //la instancia de clase, recordemos que 
        //la instancia hace que dos clases se
        //comuniquen entre si

        //el objeto sera del tipo de la clase con
        //la que nos vamos a comunicar, en este
        //caso nos queremos comunicar con la clase
        //Rectangulo

        Rectangulo mensajero = new Rectangulo(base, altura);

        //dentro del parentesis van los nombres
        //de las variables que yo quiero enviar
        //a la clase Rectangulo
        
        //ahora iremos a la clase Rectangulo
        mensajero.Imprimir();
    }   
//con el uso de this evitamos redundancias o ambiguedades
//al momento de estar trabajando con variables dentro de una
//instancia de clases, esto nos permite a nosotros poder 
//trabajar la programación orientada a objetos de manera mas
//sencilla.
}
