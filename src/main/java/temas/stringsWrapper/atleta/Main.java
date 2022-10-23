package temas.stringsWrapper.atleta;

public class Main {
    public static void main(String[] args) {
        Atleta atleta1 = new Atleta("Jose", 9.55);
        atleta1.correr400metros();
        atleta1.imprimir();
        

        Atleta atleta2 = new Atleta("Carlos", 15.2);
        atleta2.correr400metros();
        atleta2.imprimir();

        Atleta.imprimirSeleccion();
        Atleta.imprimirTiempoEquipo();
    }
}
