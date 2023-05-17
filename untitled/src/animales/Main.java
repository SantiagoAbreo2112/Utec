package animales;

//Realice un proyecto que:
//• Definir clase Mascota, con los siguientes atributos:
//  idMascota, nombre, cantidadDePatas.
//• Defina un array de 3 mascotas.
//• Solicite los datos de las 3 mascotas por consola.
//• Haga el control de excepciones para que solamente se puedan ingresar
//mascotas con 2 o 4 patas. Si el usuario ingresa un dato no válido, el programa
//debe permitirle ingresar nuevamente los datos de otra mascota que sea válida
//(o sea, que quede en loop hasta que la mascota tenga todos los atributos
//correctos).
//• Grabe un video, que m

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // scanner
        Scanner sc = new Scanner(System.in);
        //defino array y creo la mascota
        Mascota[] mascotas = new Mascota[3];
        //variables a rellenadas por usuario
        int idMascota;
        String nombre;
        int cantidadDePatas;

        for (int i = 0; i < 3; i++) {
           do {
                System.out.print("Ingrese el ID de la mascota: ");
                idMascota = sc.nextInt();

                System.out.print("Ingrese el nombre de la mascota: ");
                nombre = sc.next();

                System.out.print("Ingrese la cantidad de patas de la mascota: ");
                cantidadDePatas = sc.nextInt();

                if (cantidadDePatas != 2 && cantidadDePatas != 4) {
                    System.out.println("Error: la cantidad de patas debe ser 2 o 4");
                }
            }
           //Mientras que cantidad de patas sea diferente a 2 y 4 vamos a repetir el el bloque do

            while (cantidadDePatas != 2 && cantidadDePatas != 4);

            mascotas[i] = new Mascota(idMascota, nombre, cantidadDePatas);
        }


        for (int i = 0; i < 3; i++) {
            System.out.println("Mascota " + mascotas[i].getIdMascota() + ":");
            System.out.println("  Nombre: " + mascotas[i].getNombre());
            System.out.println("  Cantidad de patas: " + mascotas[i].getCantidadDePatas());
        }
    }
}