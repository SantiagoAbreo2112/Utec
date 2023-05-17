package semana2;

import java.util.LinkedList;

public class Principal {

    public static void main(String[] args){

        Sucursal sucursal1 = new Sucursal("Casa Central","Montevideo","28082888",
                "259142368838",1,new LinkedList<>());

        Sucursal sucursal2 = new Sucursal("Sucursal Durazno","Durazno","25823698",
                "248648282536",3,new LinkedList<>());

        Jornalero jornalero1=new Jornalero("Juan","Zabala","Dueazno","286223858",
                328672,68,215.5,120);

        Jornalero jornalero2=new Jornalero("Pedro","Rosen","Montevideo","2852639",
                669825,30,280,100.5);

        Mensual mensual1=new Mensual("Romina","Paito","Durazno","2528655",333458,
                50,38000,"Comercial");

        Mensual mensual2=new Mensual("Lucas","Manzi","Montevideo","2887469",225698,
                45,38500,"Comercial");

        sucursal1.listaEmpleados.add(jornalero2);
        sucursal1.listaEmpleados.add(mensual2);
        sucursal2.listaEmpleados.add(jornalero1);
        sucursal2.listaEmpleados.add(mensual1);

        double gastoSueldosSuc1 = 0;
        double gastoSueldosSuc2 = 0;


        for (Empleado empleado: sucursal1.listaEmpleados){

            int horas= (int) jornalero1.getHorasRealizadas();
            double valorH= jornalero1.getValorHora();

            gastoSueldosSuc1 = Empleado.getSueldo(horas, valorH);
            gastoSueldosSuc1 = gastoSueldosSuc1 + mensual1.getSalarioMensual();

        }

        for (Empleado empleado: sucursal2.listaEmpleados){

            int horas= (int) jornalero2.getHorasRealizadas();
            double valorH= jornalero2.getValorHora();

            gastoSueldosSuc2 = Empleado.getSueldo(horas, valorH);
            gastoSueldosSuc2 = gastoSueldosSuc2 + mensual2.getSalarioMensual();

        }

        System.out.println("Gastos por conceptos de Sueldo Sucursal 1 - "+gastoSueldosSuc1);
        System.out.println("Gastos por conceptos de Sueldo Sucursal 2 - "+gastoSueldosSuc2);
        System.out.println(sucursal1.listaEmpleados.toString());

    }




}
