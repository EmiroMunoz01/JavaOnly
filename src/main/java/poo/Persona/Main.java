package poo.Persona;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Emiro";
        persona1.apellido = "Muñoz";
        persona1.desplegarInformación();

        Persona persona2 = new Persona();
        persona2.nombre = "Laura";
        persona2.apellido = "Muñoz";
        persona2.desplegarInformación();
    }
}
