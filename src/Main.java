/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import controller.IMCController;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        IMCController controlador = new IMCController();

        JFrame ventana = new JFrame("Calculadora de IMC");
        ventana.add(controlador.getVista());  
        ventana.pack();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}