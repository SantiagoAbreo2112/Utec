
public class Principal {
    public static void main(String[] args) {

        int alturaL = 7;
        int anchuraL = 5;


        //Dibujo E

        for (int columna = 1; columna <= anchuraL; columna++) {
            System.out.print("* ");
        }

        for (int filas = 1; filas <= alturaL; filas++) {
            System.out.println("*");

            if (filas == 3) {
                for (int columna = 1; columna <= anchuraL; columna++) {
                    System.out.print("* ");
                }
            }
            if (filas == 6) {
                for (int columna = 1; columna <= anchuraL; columna++) {
                    System.out.print("* ");
                }
            }
        }


    }

}
