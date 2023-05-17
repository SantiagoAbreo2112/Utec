package semana2;

public class Jornalero extends Empleado {
    private double valorHora,horasRealizadas;

    public Jornalero(String nombre, String apellido, String direccion, String telefono, int numBps, int numFuncionario, double valorHora, double horasRealizadas) {
        super(nombre, apellido, direccion, telefono, numBps, numFuncionario);
        this.valorHora = valorHora;
        this.horasRealizadas = horasRealizadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public double getHorasRealizadas() {
        return horasRealizadas;
    }

    @Override
    public String toString() {
        return "Empleado Jornalero{" +
                "nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", direccion='" + getDireccion() + '\'' +
                ", telefono='" + getTelefono() + '\'' +
                ", numBps=" + getNumBps() +
                ", numFuncionario=" + getNumFuncionario() +
                "valorHora=" + valorHora +
                ", horasRealizadas=" + horasRealizadas +
                '}';
    }

}
