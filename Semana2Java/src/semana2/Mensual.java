package semana2;

public class Mensual extends Empleado{

    private double salarioMensual;
    private String tipoRegimen;

    public Mensual(String nombre, String apellido, String direccion, String telefono, int numBps, int numFuncionario, double salarioMensual, String tipoRegimen) {
        super(nombre, apellido, direccion, telefono, numBps, numFuncionario);
        this.salarioMensual = salarioMensual;
        this.tipoRegimen = tipoRegimen;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    @Override
    public String toString() {

        return "Empleado Mensual{" +
                "nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", direccion='" + getDireccion() + '\'' +
                ", telefono='" + getTelefono() + '\'' +
                ", numBps=" + getNumBps() +
                ", numFuncionario=" + getNumFuncionario() +
                "salarioMensual=" + salarioMensual +
                ", tipoRegimen='" + tipoRegimen + '\'' +
                '}';
    }

}
