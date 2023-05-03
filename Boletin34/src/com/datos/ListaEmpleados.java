
package com.datos;


import com.entidades.Empleado;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class ListaEmpleados {
    
    ArrayList<Empleado> listaEmpleados = new ArrayList<>();
    
    
    public void crearEmpleados(){
    
        GregorianCalendar cal1 = new GregorianCalendar(2020,2,2);
        
        Empleado e1 = new Empleado("5","Sam","Gardon",cal1);
        
        listaEmpleados.add(e1);
    
    }
    
}
