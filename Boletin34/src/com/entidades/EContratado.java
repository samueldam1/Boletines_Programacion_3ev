package com.entidades;


public class EContratado extends Empleado{
    
    // Sueldo base
    public static double Sueldo = 900;
    
    public static double bonus = 100;
    
    public void calcularTiempoServido(){
    
        
        
    }
    
    public void calcularBonus(int tiempoServido){
        
        if (tiempoServido <= 3){
            
            bonus = Sueldo*0.05;            
        
        }else if (tiempoServido <= 7){
            
            bonus = Sueldo*0.1;            
        
        }else if (tiempoServido <= 15){
            
            bonus = Sueldo*0.15;            
        
        }else{
            
            bonus = Sueldo*0.2;            
            
        }
        
        Sueldo = Sueldo + bonus;
    }
    
}
