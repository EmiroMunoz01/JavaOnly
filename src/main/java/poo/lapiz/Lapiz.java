package poo.lapiz;

public class Lapiz {
    private String marca;
    private int estadoLapiz;
    private String color;
    enum tipoForma{
        TRIANGULAR, HEXAGONAL, CIRCULAR
    }
    tipoForma tipoFormaLapiz;

    public Lapiz(String marca, int estadoLapiz, String color, tipoForma tipoFormaLapiz) {
        this.marca = marca;
        this.estadoLapiz = estadoLapiz;
        this.color = color;
        this.tipoFormaLapiz = tipoFormaLapiz;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getEstadoLapiz() {
        return this.estadoLapiz;
    }

    public void setEstadoLapiz(int estadoLapiz) {
        this.estadoLapiz = estadoLapiz;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public tipoForma getTipoFormaLapiz() {
        return this.tipoFormaLapiz;
    }

    public void setTipoFormaLapiz(tipoForma tipoFormaLapiz) {
        this.tipoFormaLapiz = tipoFormaLapiz;
    }
    
    void afilar(int sacarPunta){
        if (sacarPunta <= estadoLapiz){
            estadoLapiz = estadoLapiz - sacarPunta;
            System.out.println("El estado del lapiz es del: "+estadoLapiz+"%");
        }
        else{
            System.out.println("No se puede sacar un porcentaje de punta mayor al estado del mismo, abriras un agujero negro!");
        }
    }
    public void imprimir(){
        System.out.println("La marca del lapiz es: "+ marca);
        System.out.println("El estado del lapiz es: "+ estadoLapiz + "%");
        System.out.println("El color del lapiz es: "+ color);
        System.out.println("La forma del lapiz es: "+tipoFormaLapiz);
    }
}
