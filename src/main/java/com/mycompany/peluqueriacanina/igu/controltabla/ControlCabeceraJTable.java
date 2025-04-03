package com.mycompany.peluqueriacanina.igu.controltabla;

import java.awt.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class ControlCabeceraJTable extends DefaultTableCellRenderer{
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        setForeground(Color.WHITE);
        setHorizontalAlignment(CENTER);
        setBackground(new Color(50, 50, 50));
        setFont(new Font("Dialog", Font.BOLD, 12));
        
        return this;
        
    }
}