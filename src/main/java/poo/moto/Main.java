package poo.moto;

import poo.moto.Moto.tipoCom;

public class Main {
    
    public static void main(String[] args) {
        Moto moto1 = new Moto("Yamaha", 2020,120,0, tipoCom.GASOLINA);

        moto1.imprimir();
        moto1.setVelocidadActual(20);
        System.out.println("Velocidad actual = "+ moto1.velocidadActual);
        moto1.acelerar(20);
        System.out.println("Velocidad actual = "+ moto1.velocidadActual);
        moto1.desacelerar(10);
        System.out.println("Velocidad actual = "+ moto1.velocidadActual);
        moto1.frenar();
        System.out.println("Velocidad actual = "+ moto1.velocidadActual);
        moto1.desacelerar(20);




    }

}
