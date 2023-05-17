import java.util.Scanner;
public class Main {
    public static void Nombres (int nom){

        char[] alfabeto = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        if (nom==1){
            // Imprimir el nombre "Santiago Abreo"
            System.out.print(alfabeto[19]); // S
            System.out.print(alfabeto[0]); // a
            System.out.print(alfabeto[13]); // n
            System.out.print(alfabeto[20]); // t
            System.out.print(alfabeto[8]); // i
            System.out.print(alfabeto[0]); // a
            System.out.print(alfabeto[6]); // g
            System.out.print(alfabeto[15]); // o
            System.out.print(" ");
            System.out.print(alfabeto[0]); // a
            System.out.print(alfabeto[1]); // b
            System.out.print(alfabeto[18]); // R
            System.out.print(alfabeto[4]); // e
            System.out.print(alfabeto[15]); // o
            System.out.print(" ");
            System.out.print(":)");

        }
        else if (nom==0){
            // Imprimir el nombre "Mathias Rodriguez"
            System.out.print(alfabeto[12]); // M
            System.out.print(alfabeto[0]); // a
            System.out.print(alfabeto[20]); // t
            System.out.print(alfabeto[7]); // h
            System.out.print(alfabeto[8]); // i
            System.out.print(alfabeto[0]); // a
            System.out.print(alfabeto[19]); // s
            System.out.print(" ");
            System.out.print(alfabeto[18]); // R
            System.out.print(alfabeto[15]); // o
            System.out.print(alfabeto[3]); // d
            System.out.print(alfabeto[18]); // R
            System.out.print(alfabeto[8]); // i
            System.out.print(alfabeto[6]); // g
            System.out.print(alfabeto[21]); // u
            System.out.print(alfabeto[4]); // e
            System.out.print(alfabeto[26]); // z

        }

    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("----- Elije un Nombre -----");
        System.out.println("0: Mathias Rodriguez");
        System.out.println("1: Santiago Abreo");

        // Entrada a la Funcion
        Nombres(sc.nextInt());
    }
}

