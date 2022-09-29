package poo.auto;

import poo.auto.Auto.tipoA;
import poo.auto.Auto.tipoCol;
import poo.auto.Auto.tipoCom;

public class Main{
    public static void main(String[] args) {
        Auto auto1 = new Auto("Toyota", 2020, 3000, tipoCom.GASOLINA, tipoA.COMPACTO, 6, 7, 150, tipoCol.BLANCO, 100);

        auto1.acelerar(10);
        System.out.println(auto1.getVelocidadActual());
        
    }
    
    
}