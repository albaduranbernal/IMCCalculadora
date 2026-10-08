/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Alba Duran Bernal
 */
/**
 * Modelo de la calculadora de IMC.
 * Contiene solo la lógica de negocio: no sabe nada de la vista ni del controlador.
 */
public class IMCModel {

    // Fórmula estándar: peso (kg) / altura² (m)
    public float calcular(float peso, float altura) {
        return peso / (altura * altura);
    }

    // Rangos de la OMS. Los if-else van de menor a mayor, así que cada
    // "else if" ya implica que el valor anterior se superó (no hace falta límite inferior)
    public String clasificar(float imc) {
        if (imc < 18.5) {
            return "Bajo Peso";
        } else if (imc < 25.0) {       // 18.5 - 24.9
            return "Peso Normal";
        } else if (imc < 30.0) {       // 25.0 - 29.9
            return "Sobrepeso";
        } else if (imc < 35.0) {       // 30.0 - 34.9
            return "Obesidad G1";
        } else if (imc < 40.0) {       // 35.0 - 39.9
            return "Obesidad G2";
        } else {                       // 40.0 o más
            return "Obesidad G3";
        }
    }
}