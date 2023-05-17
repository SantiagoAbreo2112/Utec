package animales;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Defina una clase Mascota, con por lo menos los siguientes atributos:
        //idMascota, nombre, cantidadDePatas.
        //• Defina un array de 3 mascotas.
        //• Solicite los datos de las 3 mascotas por consola.
        //• Haga el control de excepciones para que solamente se puedan ingresar
        //mascotas con 2 o 4 patas. Si el usuario ingresa un dato no válido, el programa
        //debe permitirle ingresar nuevamente los datos de otra mascota que sea válida
        //(o sea, que quede en loop hasta que la mascota tenga todos los atributos
        //correctos).
        //• Grabe un video, que muestre el funcionamiento del programa.

        String nombre;
        String Mascotas[]= new String[3];

        for (int i=0;i<3;i++){
            System.out.println("Ingrese el nombre de su Mascota");
            Mascotas[i]=sc.nextLine();
        }

        Mascota coso=new Masc

    }


}