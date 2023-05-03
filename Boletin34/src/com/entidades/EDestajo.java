
package com.entidades;

public class EDestajo extends Empleado{
    
    public static double Sueldo = 700;
    
    public static double complemento = 20;
    
    public void calcularSueldo(int clienteCaptado){
        
        double complemento = 1;
        
        Sueldo = Sueldo + (complemento * clienteCaptado);
        
        //return Sueldo;
        
    }
    
}
