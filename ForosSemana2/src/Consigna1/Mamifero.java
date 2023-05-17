package Consigna1;

public class Mamifero extends Animal {

    private String tipoDePelaje;

    public Mamifero(String nombre, String tipoDeAlimentacion, int edad, String tipoDePelaje) {
        super(nombre, tipoDeAlimentacion, edad);
        this.tipoDePelaje = tipoDePelaje;
    }
}

