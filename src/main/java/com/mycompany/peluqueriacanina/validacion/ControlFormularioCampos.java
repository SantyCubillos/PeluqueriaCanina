package com.mycompany.peluqueriacanina.validacion;

import java.awt.Color;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.text.BadLocationException;

public class ControlFormularioCampos implements KeyListener{

    @Override
    public void keyTyped(KeyEvent e) {  
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        //Agrega un borde gris en los campos no estan vacios
        if (e.getSource() instanceof JTextField textField) {
            if (!textField.getText().trim().isEmpty()) {
                textField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            }
        }
        //Agrega un borde gris en los campos no estan vacios
        if (e.getSource() instanceof JTextArea textArea) {
            if (!textArea.getText().trim().isEmpty()) {
                textArea.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
            }
            if (e.getKeyCode() == KeyEvent.VK_ENTER || e.getKeyCode() == KeyEvent.VK_TAB) {
                SwingUtilities.invokeLater(() -> {
                    try {
                        KeyboardFocusManager.getCurrentKeyboardFocusManager().focusNextComponent();
                        textArea.setCaretPosition(textArea.getLineStartOffset(0));
                    } catch (BadLocationException ex) {
                        Logger.getLogger(ControlFormularioCampos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                });
            }
        }
        //Pasa al siguiente campo al presionar la tecla asignada.
        if (e.getKeyCode() == KeyEvent.VK_ENTER ) {
            KeyboardFocusManager.getCurrentKeyboardFocusManager().focusNextComponent();
        } else if (e.getKeyCode() == KeyEvent.VK_SHIFT + KeyEvent.VK_TAB) {
            KeyboardFocusManager.getCurrentKeyboardFocusManager().focusPreviousComponent();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
}