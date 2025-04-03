package com.mycompany.peluqueriacanina.igu;

import com.mycompany.peluqueriacanina.logica.ControladoraLogica;
import com.mycompany.peluqueriacanina.logica.Mascota;
import com.mycompany.peluqueriacanina.recursos.CargarImagenes;
import com.mycompany.peluqueriacanina.validacion.*;
import javax.swing.text.AbstractDocument;

public class ModificarDatos extends javax.swing.JFrame {
    
    ControladoraLogica control = null;
    ControlFormularioBotones controlFormulario = new ControlFormularioBotones();
    CargarImagenes cargarImagenes = new CargarImagenes();
    Notificaciones notificacion = new Notificaciones();
    Mascota mascota = null;
    
    public ModificarDatos(int idMascota) {
        control = new ControladoraLogica();
        initComponents();
        CargarImagen();
        CargarDatos(idMascota);
        ValidacionCaracteres();
        ControlCampos();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        PanelControl = new javax.swing.JPanel();
        lblNombreMacota = new javax.swing.JLabel();
        lblRazaMascota = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        lblAlergico = new javax.swing.JLabel();
        lblAtencion = new javax.swing.JLabel();
        lblNombreDueno = new javax.swing.JLabel();
        lblCelDueno = new javax.swing.JLabel();
        lblObservaciones = new javax.swing.JLabel();
        lblDirDueno = new javax.swing.JLabel();
        txtNombreMascota = new javax.swing.JTextField();
        txtRazaMascota = new javax.swing.JTextField();
        txtColorMascota = new javax.swing.JTextField();
        txtDirDueno = new javax.swing.JTextField();
        txtNombreDueno = new javax.swing.JTextField();
        txtCelDueno = new javax.swing.JTextField();
        cmbAlergico = new javax.swing.JComboBox<>();
        cmbAtencion = new javax.swing.JComboBox<>();
        jScrollPane = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        lblLogo = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CARGA DE DATOS");
        setName("CARGA DE DATOS"); // NOI18N
        setResizable(false);

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitulo.setText("MODIFICAR DATOS");

        lblNombreMacota.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblNombreMacota.setText("Nombre Mascota:");

        lblRazaMascota.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblRazaMascota.setText("Raza Mascota:");

        lblColor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblColor.setText("Color Mascota:");

        lblAlergico.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblAlergico.setText("Alérgico");

        lblAtencion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblAtencion.setText("Atención especial:");

        lblNombreDueno.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblNombreDueno.setText("Nombre Dueño:");

        lblCelDueno.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblCelDueno.setText("Cel Dueño:");

        lblObservaciones.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblObservaciones.setText("Observaciones:");

        lblDirDueno.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblDirDueno.setText("Dirección Dueño:");

        cmbAlergico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO", "SI" }));

        cmbAtencion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO", "SI" }));

        txtObservaciones.setColumns(20);
        txtObservaciones.setLineWrap(true);
        txtObservaciones.setRows(5);
        jScrollPane.setViewportView(txtObservaciones);

        javax.swing.GroupLayout PanelControlLayout = new javax.swing.GroupLayout(PanelControl);
        PanelControl.setLayout(PanelControlLayout);
        PanelControlLayout.setHorizontalGroup(
            PanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelControlLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(PanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelControlLayout.createSequentialGroup()
                        .addGroup(PanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAtencion)
                            .addComponent(lblNombreDueno)
                            .addComponent(lblCelDueno)
                            .addComponent(lblDirDueno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbAtencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDirDueno)
                            .addComponent(txtCelDueno)
                            .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(txtNombreDueno, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(PanelControlLayout.createSequentialGroup()
                        .addGroup(PanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreMacota)
                            .addComponent(lblRazaMascota)
                            .addComponent(lblColor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtColorMascota)
                            .addComponent(txtRazaMascota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                            .addComponent(txtNombreMascota, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(PanelControlLayout.createSequentialGroup()
                        .addGroup(PanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblObservaciones)
                            .addGroup(PanelControlLayout.createSequentialGroup()
                                .addComponent(lblAlergico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelControlLayout.setVerticalGroup(
            PanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelControlLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreMacota)
                    .addComponent(txtNombreMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRazaMascota)
                    .addComponent(txtRazaMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColor)
                    .addComponent(txtColorMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlergico)
                    .addComponent(cmbAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAtencion)
                    .addComponent(cmbAtencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreDueno)
                    .addComponent(txtNombreDueno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCelDueno)
                    .addComponent(txtCelDueno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDirDueno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDirDueno))
                .addGap(18, 18, 18)
                .addGroup(PanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelControlLayout.createSequentialGroup()
                        .addComponent(lblObservaciones)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnLimpiar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setFocusable(false);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnGuardar.setText("GUARDAR CAMBIOS");
        btnGuardar.setFocusable(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnVolver.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnVolver.setText("VOLVER");
        btnVolver.setFocusable(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(235, 235, 235))
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PanelControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
      
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        controlFormulario.LimpiarCampos(PanelControl, txtObservaciones);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        if (!txtNombreMascota.getText().isEmpty() && !txtRazaMascota.getText().isEmpty() && !txtColorMascota.getText().isEmpty() && !txtNombreDueno.getText().isEmpty() && !txtCelDueno.getText().isEmpty() && !txtDirDueno.getText().isEmpty() && !txtObservaciones.getText().isEmpty()) {
            String nombreMascota = txtNombreMascota.getText().trim();
            String razaMascota = txtRazaMascota.getText().trim();
            String colorMascota = txtColorMascota.getText().trim();
            String observaciones = txtObservaciones.getText().trim();
            String alergico = (String) cmbAlergico.getSelectedItem();
            String atencion = (String) cmbAtencion.getSelectedItem();
            String nombreDueno = txtNombreDueno.getText().trim();
            String celDueno = txtCelDueno.getText().trim();
            String dirDueno = txtDirDueno.getText().trim();
            control.ModificarMascota(mascota, nombreMascota, razaMascota, colorMascota, observaciones, alergico, atencion, nombreDueno, celDueno, dirDueno);
            //Muestra un mensaje de registro actulizado exitoso
            notificacion.ActulizacionExitosa(nombreMascota, razaMascota);
            //Recarga nuevamente la ventana VisualizarDatos para ver los cambios
            VisualizarDatos visualizarDatos = new VisualizarDatos();
            visualizarDatos.setVisible(true);
            this.dispose();   
        } else {
            controlFormulario.ValidarCamposVacios(PanelControl, txtObservaciones);
            notificacion.CamposObligatorios();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VisualizarDatos visualizarDatos = new VisualizarDatos();
        visualizarDatos.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed
        
    private void CargarDatos(int idMascota){
        this.mascota = control.TraerMascota(idMascota);
        
        txtNombreMascota.setText(mascota.getNombreMascota());
        txtRazaMascota.setText(mascota.getRazaMascota());
        txtColorMascota.setText(mascota.getColorMascota());
        txtNombreDueno.setText(mascota.getDueno().getNombreDueno());
        txtCelDueno.setText(mascota.getDueno().getCelDueno());
        txtDirDueno.setText(mascota.getDueno().getDireccionDueno());
        txtObservaciones.setText(mascota.getObservaciones());
        cmbAlergico.setSelectedItem(mascota.getAlergico());
        cmbAtencion.setSelectedItem(mascota.getAtencionEspecial());
    }
    
    private void CargarImagen(){
        cargarImagenes.CargarIcono(this);
        cargarImagenes.CargarLogo(lblLogo);
        cargarImagenes.CargarBotonLimpiar(btnLimpiar);
        cargarImagenes.CargarBotonGuardar(btnGuardar);
        cargarImagenes.CargarBotonVolver(btnVolver);
    }
    
    private void ValidacionCaracteres(){
        ((AbstractDocument) txtNombreMascota.getDocument()).setDocumentFilter(new SoloLetras(20));
        ((AbstractDocument) txtRazaMascota.getDocument()).setDocumentFilter(new SoloLetras(20));
        ((AbstractDocument) txtColorMascota.getDocument()).setDocumentFilter(new SoloLetras(50));
        ((AbstractDocument) txtNombreDueno.getDocument()).setDocumentFilter(new SoloLetras(50));
        ((AbstractDocument) txtCelDueno.getDocument()).setDocumentFilter(new SoloNumeros(10));
    }
    
    private void ControlCampos(){
        ControlFormularioCampos controlCampos = new ControlFormularioCampos();
        txtNombreMascota.addKeyListener(controlCampos);
        txtRazaMascota.addKeyListener(controlCampos);
        txtColorMascota.addKeyListener(controlCampos);
        cmbAlergico.addKeyListener(controlCampos);
        cmbAtencion.addKeyListener(controlCampos);
        txtNombreDueno.addKeyListener(controlCampos);
        txtCelDueno.addKeyListener(controlCampos);
        txtDirDueno.addKeyListener(controlCampos);
        txtObservaciones.addKeyListener(controlCampos);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelControl;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbAlergico;
    private javax.swing.JComboBox<String> cmbAtencion;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblAlergico;
    private javax.swing.JLabel lblAtencion;
    private javax.swing.JLabel lblCelDueno;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblDirDueno;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNombreDueno;
    private javax.swing.JLabel lblNombreMacota;
    private javax.swing.JLabel lblObservaciones;
    private javax.swing.JLabel lblRazaMascota;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCelDueno;
    private javax.swing.JTextField txtColorMascota;
    private javax.swing.JTextField txtDirDueno;
    private javax.swing.JTextField txtNombreDueno;
    private javax.swing.JTextField txtNombreMascota;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextField txtRazaMascota;
    // End of variables declaration//GEN-END:variables

}