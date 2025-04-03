package com.mycompany.peluqueriacanina.igu;

import com.mycompany.peluqueriacanina.igu.controltabla.*;
import com.mycompany.peluqueriacanina.logica.ControladoraLogica;
import com.mycompany.peluqueriacanina.logica.Mascota;
import com.mycompany.peluqueriacanina.recursos.CargarImagenes;
import com.mycompany.peluqueriacanina.validacion.Notificaciones;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class VisualizarDatos extends javax.swing.JFrame {
    
    ControladoraLogica control = null;
    CargarImagenes cargarImagenes = new CargarImagenes();
    Notificaciones notificacion = new Notificaciones();
    
    public VisualizarDatos() {
        control = new ControladoraLogica();
        initComponents();
        CargarImagen();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        PanelTabla = new javax.swing.JPanel();
        lblTabla = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMascotas = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnDetalle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VISUALIZACIÓN DE DATOS");
        setName("VISUALIZACIÓN DE DATOS"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitulo.setText("VISUALIZACIÓN DE DATOS");

        PanelTabla.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTabla.setText("Datos de mascotas:");

        tblMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblMascotas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(tblMascotas);

        javax.swing.GroupLayout PanelTablaLayout = new javax.swing.GroupLayout(PanelTabla);
        PanelTabla.setLayout(PanelTablaLayout);
        PanelTablaLayout.setHorizontalGroup(
            PanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
                    .addGroup(PanelTablaLayout.createSequentialGroup()
                        .addComponent(lblTabla)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelTablaLayout.setVerticalGroup(
            PanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTabla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnEditar.setFocusable(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setFocusable(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnVolver.setFocusable(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnDetalle.setFocusable(false);
        btnDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnDetalle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 131, Short.MAX_VALUE))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        CargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        //Se verifica que la tabla no este vacia.
        if (tblMascotas.getRowCount() > 0) {
            //Se verifica que se haya seleccionado un registro
            if (tblMascotas.getSelectedRow() != - 1) {
                int idMascota = Integer.parseInt(String.valueOf(tblMascotas.getValueAt(tblMascotas.getSelectedRow(), 0))); 
                ModificarDatos modificarDatos = new ModificarDatos(idMascota);
                modificarDatos.setVisible(true);
                dispose();
            }else{
                notificacion.RegistroNoSeleccionado();
            }
        }else{
            notificacion.SinRegistros();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //Se verifica que la tabla no este vacia.
        if (tblMascotas.getRowCount() > 0) {
            //Se verifica que se haya seleccionado un registro
            if (tblMascotas.getSelectedRow() != - 1) {
                int idMascota = Integer.parseInt(String.valueOf(tblMascotas.getValueAt(tblMascotas.getSelectedRow(), 0)));
                String NomMascota = String.valueOf(tblMascotas.getValueAt(tblMascotas.getSelectedRow(), 1));
                //Muestra un menjase que pregunta al usuario si esta seguro de elimiar el registro
                int comfirmar = notificacion.ComfirmarEliminacion(NomMascota, idMascota);
                if (comfirmar == JOptionPane.YES_OPTION) {
                    control.BorrarMascota(idMascota);
                    CargarTabla();
                    notificacion.RegistroEliminado(NomMascota, idMascota);
                }
            }else{
                notificacion.RegistroNoSeleccionado();
            }
        }else{
            notificacion.SinRegistros();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalleActionPerformed
        //Se verifica que la tabla no este vacia.
        if (tblMascotas.getRowCount() > 0) {
            //Se verifica que se haya seleccionado un registro
            if (tblMascotas.getSelectedRow() != - 1) {
                int idMascota = Integer.parseInt(String.valueOf(tblMascotas.getValueAt(tblMascotas.getSelectedRow(), 0)));
                String NomMascota = String.valueOf(tblMascotas.getValueAt(tblMascotas.getSelectedRow(), 1)); 
                
                DatosDetallados datosDetallados = new DatosDetallados(this, true, NomMascota, idMascota);
                datosDetallados.setVisible(true);
            }else{
                notificacion.RegistroNoSeleccionado();
            }
        }else{
            notificacion.SinRegistros();
        }
    }//GEN-LAST:event_btnDetalleActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Peluqueria peluqueria = new Peluqueria();
        peluqueria.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed
    
    private void CargarTabla(){
        ControlCabeceraJTable controlCabecera = new ControlCabeceraJTable();
        ControlFilasJTable controlFilas = new ControlFilasJTable();
        //Definir el modelo que se quiere que tenga la tabla.
        DefaultTableModel modelo = new DefaultTableModel(){
            //Filas y Columnas no van hacer editables.
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
 
        String titulos[] = {"Num", "Nombre", "Raza", "Color", "Alergico", "At. Esp", "Dueño", "Cel", "Dir"};
        modelo.setColumnIdentifiers(titulos);
        tblMascotas.setModel(modelo);
        
        //Personaliza la cabecera
        tblMascotas.getTableHeader().setDefaultRenderer(controlCabecera);
        
        //Personaliza las filas
        for (int i = 0; i < tblMascotas.getColumnCount(); i++) {
            tblMascotas.getColumnModel().getColumn(i).setCellRenderer(controlFilas);
        }
        
        //Carga los datos desde la base de datos y se agregan a una lista
        List<Mascota> listaMascotas = control.TraerMascotas();
        
        //Recorrer la lista y mostrar cada uno de sus elementos
        if (listaMascotas != null) {  
            for (Mascota masco : listaMascotas) {
                Object[] objeto = {masco.getIdMascota(), masco.getNombreMascota(), masco.getRazaMascota(), masco.getColorMascota(), masco.getAlergico(), masco.getAtencionEspecial(), masco.getDueno().getNombreDueno(), 
                masco.getDueno().getCelDueno(), masco.getDueno().getDireccionDueno()};
                
                modelo.addRow(objeto);
            }
        }
        
        //Adapta las columanas de la tabla al texto
        for (int i = 0; i < tblMascotas.getColumnCount(); i++) {
            TableColumn column = tblMascotas.getColumnModel().getColumn(i);
            int ancho = (int) tblMascotas.getTableHeader().getDefaultRenderer().getTableCellRendererComponent(tblMascotas, column.getHeaderValue(), false, false, -1, i).getPreferredSize().getWidth();
            for (int j = 0; j < tblMascotas.getRowCount(); j++) {
                int anchoPreferido = (int) tblMascotas.getCellRenderer(j, i).getTableCellRendererComponent(tblMascotas, tblMascotas.getValueAt(j, i), false, false, j, i).getPreferredSize().getWidth();
                ancho = Math.max(ancho, anchoPreferido);
            }
            column.setPreferredWidth(ancho + 5);
        }
        
        //Si noy registros las columnas ocupan el ancho total del panel de la tabla
        if (tblMascotas.getRowCount() <= 0) {
            tblMascotas.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);   
        }
    }
    
    private void CargarImagen(){
        cargarImagenes.CargarIcono(this);
        cargarImagenes.CargarBotonEditar(btnEditar);
        cargarImagenes.CargarBotonEliminar(btnEliminar);
        cargarImagenes.CargarBotonDetalles(btnDetalle);
        cargarImagenes.CargarBotonVolver(btnVolver);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel PanelTabla;
    private javax.swing.JButton btnDetalle;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTabla;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblMascotas;
    // End of variables declaration//GEN-END:variables
}