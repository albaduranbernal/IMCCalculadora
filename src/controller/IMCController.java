/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.IMCView;
import model.IMCModel;

/**
 *
 * @author Alba Duran Bernal
 */
public class IMCController implements ActionListener {

    IMCView vista;
    IMCModel modelo;

    public IMCController() {
        vista = new IMCView();
        modelo = new IMCModel();

        vista.getBoton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        empezar();
    }

    public void empezar() {
        if (vista.getAltura().trim().isEmpty() || vista.getPeso().trim().isEmpty()) {
            vista.mensajeVacio();
        } else if (comprobarNumero(vista.getPeso(), vista.getAltura())) {
            float peso = Float.parseFloat(vista.getPeso().trim().replace(',', '.'));
            float altura = Float.parseFloat(vista.getAltura().trim().replace(',', '.'));

            float imc = modelo.calcular(peso, altura);
            String clasificacion = modelo.clasificar(imc);

            vista.mostrarResultado(imc, clasificacion);
        } else {
            vista.mensajeError();
        }
    }

    public IMCView getVista() {
        return vista;
    }

    public boolean comprobarNumero(String peso, String altura) {
        boolean correcto;
        try {
            float p = Float.parseFloat(peso.trim().replace(',', '.'));
            float a = Float.parseFloat(altura.trim().replace(',', '.'));
            correcto = p > 0 && a > 0;   // evita división entre 0 o valores negativos
        } catch (NumberFormatException nfe) {
            correcto = false;
        }
        return correcto;
    }
}
