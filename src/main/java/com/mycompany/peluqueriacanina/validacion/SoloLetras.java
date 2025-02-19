package com.mycompany.peluqueriacanina.validacion;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class SoloLetras extends DocumentFilter {
    
    private final int max;
    Notificaciones notificacion = new Notificaciones();

    public SoloLetras(int max) {
        this.max = max;
    }
    
    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
        if (string == null) {
            return;
        }
        
        if (containsOnlyLettersAndSpaces(string) && fb.getDocument().getLength() + string.length() <= max) {
            super.insertString(fb, offset, string, attr);
        }
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        if (text == null) {
            return;
        }
        
        if (containsOnlyLettersAndSpaces(text) && fb.getDocument().getLength() - length + text.length() <= max) {
            super.replace(fb, offset, length, text, attrs);
        }
    }

    private boolean containsOnlyLettersAndSpaces(String text) {
        for(char key : text.toCharArray()){
            if(!Character.isLetter(key) && !Character.isSpaceChar(key)){
                notificacion.SoloLetras(max);
                return false;
            }
        }
        return true;
    }
}