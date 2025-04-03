package com.mycompany.peluqueriacanina.validacion;

import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class ControlFormularioBotones {
    
    //Limpia todos los campos despues de realizar cada registro
    public void LimpiarCampos(JPanel panel, JTextArea textArea){
        for (Component component : panel.getComponents()) {
            if (component instanceof  JTextField jTextField) {
                jTextField.setText("");
                jTextField.requestFocus();
            }
            if (component instanceof  JComboBox jComboBox) {
                jComboBox.setSelectedIndex(0);
            }
            if (!textArea.getText().trim().isEmpty()) {
                textArea.setText("");
            }
        }
    }
    
    //Agrega un borde rojo en los campos vacios
    public void ValidarCamposVacios(JPanel panel, JTextArea textArea){
        for (Component component : panel.getComponents()) {
            if (component instanceof JTextField jTextField) {
                if (jTextField.getText().trim().isEmpty()) {
                    jTextField.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                }
            }
        }
        if (textArea.getText().trim().isEmpty()) {
            textArea.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
    }
    
}