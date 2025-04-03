package com.mycompany.peluqueriacanina.validacion;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class SoloNumeros extends DocumentFilter {
    
    private final int max;
    Notificaciones notificacion = new Notificaciones();

    public SoloNumeros(int max) {
        this.max = max;
    }
    
    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
        if (string == null) {
            return;
        }
        
        if (containsOnlyNumber(string) && fb.getDocument().getLength() + string.length() <= max) {
            super.insertString(fb, offset, string, attr);
        }
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        if (text == null) {
            return;
        }
        
        if (containsOnlyNumber(text) && fb.getDocument().getLength() - length + text.length() <= max) {
            super.replace(fb, offset, length, text, attrs);
        }
    }

    private boolean containsOnlyNumber(String text) {
        for(char key : text.toCharArray()){
            if(!Character.isDigit(key)){
                notificacion.SoloNumeros(max);
                /*ImageIcon ImgError = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/ico-error.png")).getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH));
                JOptionPane.showMessageDialog(null, "Por favor, solo números y un maximo " + max + " caracteres", "Caracteres no permitidos.", JOptionPane.PLAIN_MESSAGE, ImgError);*/
                return false;
            }
        }
        return true;
    }
}