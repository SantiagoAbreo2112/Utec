package semana2;
public class Empleado {
private String nombre,apellido,direccion,telefono;
private Integer numBps, numFuncionario;
    public Empleado(String nombre, String apellido, String direccion, String telefono, int numBps, int numFuncionario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.numBps = numBps;
        this.numFuncionario = numFuncionario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", numBps=" + numBps +
                ", numFuncionario=" + numFuncionario +
                '}';
    }

    public static double getSueldo(int horas, double valorHora){
        double sueldo=valorHora*horas;
        return sueldo;
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getTelefono() {
        return telefono;
    }
    public int getNumBps() {
        return numBps;
    }
    public int getNumFuncionario() {
        return numFuncionario;
    }
}
