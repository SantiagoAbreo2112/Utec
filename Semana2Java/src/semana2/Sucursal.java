package semana2;

import java.util.LinkedList;

public class Sucursal {

    private String nombre,direccion,telefono,rut;
    private Integer id;
    LinkedList<Empleado> listaEmpleados;


    //Constructor
    public Sucursal(String nombre, String direccion, String telefono, String rut, Integer id,LinkedList<Empleado> listaEmpleados) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.rut = rut;
        this.id = id;
        this.listaEmpleados = listaEmpleados;
    }


}

