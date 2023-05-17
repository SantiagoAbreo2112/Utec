import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String nombres[]={"Manuel","Santiago","Agustin","German","Pedro"};

        for (int i=0;i< nombres.length;i++){
            System.out.println(nombres[i]);
        }

        String nombresUsu[] = new String[20];

        for (int i = 0; i < nombresUsu.length; ++i) {
            System.out.println("Ingrese un valor:");

            String nombreX = sc.next();
            nombresUsu[i] = nombreX;
        }
            nombresUsu.add(nombreX);
            System.out.println(nombresUsu.length-1);
        }

    }

}
