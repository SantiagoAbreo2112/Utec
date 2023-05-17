public class Mascota {

    public Mascota(int idMascota, String nombre, int cantidadDePatas) {
        this.idMascota = idMascota;
        this.nombre = nombre;
        this.paws = paws;
    }

    Private int idMascota;
    Private int nombre;
    Private int Paws;


    //set y get de ID
    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }


    //set y get de Nombre
    public int getNombre() {
        return nombre;
    }


    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    //set y get de patas
    public int getPaws() {
        return Paws;
    }
    public void setPaws(int paws) {
        Paws = paws;
    }
}
