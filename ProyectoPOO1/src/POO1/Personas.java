package POO1;

import java.time.LocalDate;

public class Personas {



    private int idPersona;
    private String nombre;
    private String apellido;
    private String dptoResidencia;
    private byte qHijos;
    private LocalDate bornDate;

    public Personas(int idPersona, String nombre, String apellido,
                    String dptoResidencia, byte qHijos, LocalDate bornDate) {

        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dptoResidencia = dptoResidencia;
        this.qHijos = qHijos;
        this.bornDate = bornDate;


    }

    //get y set de id Persona
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    //get y set de Nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //get y set de Apellido
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //get y set depto
    public String getDptoResidencia() {
        return dptoResidencia;
    }

    public void setDptoResidencia(String dptoResidencia) {
        this.dptoResidencia = dptoResidencia;
    }

    //get y set de Hijos
    public byte getqHijos() {
        return qHijos;
    }

    public void setqHijos(byte qHijos) {
        this.qHijos = qHijos;
    }

    //get y set de date
    public LocalDate getBornDate() {
        return bornDate;
    }

    public void setBornDate(LocalDate bornDate) {
        this.bornDate = bornDate;
    }
}
