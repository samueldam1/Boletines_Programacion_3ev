
package com.entidades;

import java.util.GregorianCalendar;

public class Empleado {
    
    private String DNI;
    private String Nombre;
    private String Apellidos;
    private GregorianCalendar Data_ingreso;

    public Empleado(String DNI, String Nombre, String Apellidos, GregorianCalendar Data_ingreso) {
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Data_ingreso = Data_ingreso;
    }

    public Empleado() {
    }
        
    
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public GregorianCalendar getData_ingreso() {
        return Data_ingreso;
    }

    public void setData_ingreso(GregorianCalendar Data_ingreso) {
        this.Data_ingreso = Data_ingreso;
    }

    
       
}
