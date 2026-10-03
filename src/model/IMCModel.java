/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Alba Duran Bernal
 */
public class IMCModel {

    public float calcular(float peso, float altura) {
        return peso / (altura * altura);
    }

    public String clasificar(float imc) {
        if (imc < 18.5) {
            return "Bajo Peso";
        } else if (imc < 25.0) {
            return "Peso Normal";
        } else if (imc < 30.0) {
            return "Sobrepeso";
        } else if (imc < 35.0) {
            return "Obesidad G1";
        } else if (imc < 40.0) {
            return "Obesidad G2";
        } else {
            return "Obesidad G3";
        }
    }
}
