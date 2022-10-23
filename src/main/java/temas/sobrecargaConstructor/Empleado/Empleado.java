package temas.sobrecargaConstructor.Empleado;

public class Empleado {

        private int identificador;
        private String nombre;
        private String apellidos;
        private int edad;

        public Empleado() {
                identificador = 100;
                nombre = "Nuevo Empleado";
                apellidos = "Nuevo Empleado";
                edad = 18;
                System.out.println(
                                "Identificador: " +
                                                identificador +
                                                "nombre: " +
                                                nombre +
                                                "apellidos: " +
                                                apellidos +
                                                " edad " +
                                                edad);
        }

        public Empleado(
                        int identificador,
                        String nombre,
                        String apellidos,
                        int edad) {
                this.identificador = identificador;
                this.nombre = nombre;
                this.apellidos = apellidos;
                this.edad = edad;
                System.out.println(
                                "Identificador: " +
                                                identificador +
                                                "nombre: " +
                                                nombre +
                                                "apellidos: " +
                                                apellidos +
                                                " edad " +
                                                edad);
        }
}
