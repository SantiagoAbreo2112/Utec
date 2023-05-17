public class Main {
    public static void PrecioTotal(float precioUds, int uds) {
        System.out.println("----- RECIBO DE COMPRA -----");
        float precioTotal= precioUds*uds;
        System.out.println("----- Milanesas $"+precioTotal+" Kilos x"+uds+" -----");

    }
    public static void main(String[] args) {
        System.out.println("----- BIENVENIDO A SUPER LEMA -----");
        PrecioTotal(600, 5);

    }
}