package pildoras.p3_SobrecargaConstructores.Empleado;


public class Main {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Carlos");
        Empleado empleado2 = new Empleado("Antonio");
        Empleado empleado3 = new Empleado("Jose");


        System.out.println(empleado1.devolverDatos());
        System.out.println(empleado2.devolverDatos());
        System.out.println(empleado3.devolverDatos());

        System.out.println(Empleado.dameIdSiguiente());
    }
}
