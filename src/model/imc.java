/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DAM2
 */
public class imc {
    public double calcular(double peso, double altura){
        return peso / (altura * altura);
    }
    public String clasificar (double imc){
      
        if (imc < 18.5){
            return "Bajo Peso";
        }
        if (imc < 25.0){ 
            return "Peso Normal";
        }
    }
    
}
