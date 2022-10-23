package temas.sobrecargaMetodos.restaurante;

public class Main {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido();
        pedido1.calcularPedido("Sancocho", 5000, "Gaseosa", 2000);

        Pedido pedido2 = new Pedido();
        pedido2.calcularPedido("Arroz", 3000, "Atun", 8000, "Soda", 5000);
        
    }
}
