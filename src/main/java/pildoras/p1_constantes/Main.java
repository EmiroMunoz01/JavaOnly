package pildoras.p1_constantes;

public class Main {
    public static void main(String[] args) {
        
        Pruebas empleado1 = new Pruebas("Jose");

        empleado1.setSeccion("RRHH");

        System.out.println(empleado1.devuelveDatos());
    }
}
