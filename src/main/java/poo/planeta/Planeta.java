package poo.planeta;

public class Planeta {

    String nombre;
    int cSatelites;
    double masaP;
    double vKil;
    int diametro;
    int dSol;

    enum tipoPlaneta {
        GASEOSO, TERRESTRE, ENANO
    }

    tipoPlaneta tipo;
    boolean esObservable = false;

    public Planeta(String nombre, int Satelites, double masaP, double vKil, int diametro, int dSol, tipoPlaneta tipo,
            boolean esObservable) {

        this.nombre = nombre;
        this.cSatelites = Satelites;
        this.masaP = masaP;
        this.vKil = vKil;
        this.diametro = diametro;
        this.dSol = dSol;
        this.tipo = tipo;
        this.esObservable = esObservable;

    }

    void imprimir() {
        System.out.println("Nombre del planeta =  " + nombre);
        System.out.println("Cantidad de satélites = " + cSatelites);
        System.out.println("Masa del planeta = " + masaP);
        System.out.println("Volumen del planeta = " + vKil);
        System.out.println("Diámetro del planeta = " + diametro);
        System.out.println("Distancia al sol = " + dSol);
        System.out.println("Tipo de planeta = " + tipo);
        System.out.println("Es observable = " + esObservable);
    }

    double calcularDensidad() {
        return masaP / vKil;
    }

    boolean esPlanetaExterior() {
        float límite = (float) (149597870 * 3.4);
        /*
         * Un planeta exterior está situado más allá del cinturón de
         * asteroides
         */
        /*
         * El cinturón se encuentra entre 2,1 y 3,4 UA (UA =
         * 149.597.870 Km)
         */
        if (dSol > límite) {
            return true;
        } else {
            return false;
        }
    }

}
