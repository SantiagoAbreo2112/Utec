package animales;

import java.util.Scanner;
public class Mascota {
    private int idMascota;
    private String nombre;
    private int cantidadDePatas;

    public Mascota(int idMascota, String nombre, int cantidadDePatas) {
        this.idMascota = idMascota;
        this.nombre = nombre;
        this.cantidadDePatas = cantidadDePatas;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadDePatas() {
        return cantidadDePatas;
    }
}