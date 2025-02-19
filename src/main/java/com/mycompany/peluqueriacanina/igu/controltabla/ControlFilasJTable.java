package com.mycompany.peluqueriacanina.igu.controltabla;

import java.awt.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class ControlFilasJTable extends DefaultTableCellRenderer{
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        
        setHorizontalAlignment(CENTER);
        
        if (EvaluarFila(row)) {
            this.setBackground(new Color(166, 166, 166));
        }else{
            this.setBackground(new Color(217, 217, 217));
        }
        
        if (isSelected) {
            this.setBackground(Color.CYAN);
            this.setFont(this.getFont().deriveFont(Font.BOLD));
        }
        
        return this;
        
    }
    
    public boolean EvaluarFila(int fila){
        return (fila % 2 == 0);
    }
}