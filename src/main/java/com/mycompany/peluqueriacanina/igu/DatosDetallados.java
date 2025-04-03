package com.mycompany.peluqueriacanina.igu;

import com.mycompany.peluqueriacanina.logica.ControladoraLogica;
import com.mycompany.peluqueriacanina.logica.Mascota;

public class DatosDetallados extends javax.swing.JDialog {
    
    ControladoraLogica control = new ControladoraLogica();
    private String NomMascota;
    private int idMascota;

    public DatosDetallados(java.awt.Frame parent, boolean modal, String NomMascota, int idMascota) {
        super(parent, "DATOS DETALLADOS DE: " + NomMascota.toUpperCase() + " COD " + idMascota , modal);
        this.NomMascota = NomMascota;
        this.idMascota = idMascota;
        initComponents();
        CargarDatos(idMascota);
    }
    
    /*private void CargarDatos(int idMascota){
        Mascota mascota = control.TraerMascota(idMascota);        
        lblNombreMascotaDetalle.setText(mascota.getNombreMascota());
    }*/
    
    private void CargarDatos(int idMascota){
        Mascota mascota = control.TraerMascota(idMascota);
        
        lblNombreMascotaDetalle.setText(mascota.getNombreMascota());
        lblRazaMascotaDetalle.setText(mascota.getRazaMascota());
        lblColorMascotaDetalle.setText(mascota.getColorMascota());
        lblAlergicoDetalle.setText(mascota.getAlergico());
        lblAtencionDetalle.setText(mascota.getAtencionEspecial());
        lblNombreDuenoDetalle.setText(mascota.getDueno().getNombreDueno());
        lblCelularDuenoDetalle.setText(mascota.getDueno().getCelDueno());
        lblDirrecionDuenoDetalle.setText(mascota.getDueno().getDireccionDueno());
        txtObservaciones.setText(mascota.getObservaciones());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        PanelControl = new javax.swing.JPanel();
        lblNombreMascota = new javax.swing.JLabel();
        lblRazaMascota = new javax.swing.JLabel();
        lblColorMascota = new javax.swing.JLabel();
        lblAlergicoMascota = new javax.swing.JLabel();
        lblAtencionMascota = new javax.swing.JLabel();
        lblNombreDueno = new javax.swing.JLabel();
        lblCelularDueno = new javax.swing.JLabel();
        lblDirrecionDueno = new javax.swing.JLabel();
        lblObservaciones = new javax.swing.JLabel();
        lblNombreMascotaDetalle = new javax.swing.JLabel();
        lblRazaMascotaDetalle = new javax.swing.JLabel();
        lblColorMascotaDetalle = new javax.swing.JLabel();
        lblAlergicoDetalle = new javax.swing.JLabel();
        lblAtencionDetalle = new javax.swing.JLabel();
        lblNombreDuenoDetalle = new javax.swing.JLabel();
        lblCelularDuenoDetalle = new javax.swing.JLabel();
        lblDirrecionDuenoDetalle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTitulo.setText("DATOS DETALLADOS");

        lblNombreMascota.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNombreMascota.setText("Nombre Mascota:");

        lblRazaMascota.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblRazaMascota.setText("Raza Mascota:");

        lblColorMascota.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblColorMascota.setText("Color Mascota:");

        lblAlergicoMascota.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblAlergicoMascota.setText("Alérgico:");

        lblAtencionMascota.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblAtencionMascota.setText("At. Esp:");

        lblNombreDueno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNombreDueno.setText("Nombre Dueño:");

        lblCelularDueno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCelularDueno.setText("Celular Dueño:");

        lblDirrecionDueno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblDirrecionDueno.setText("Dirección Dueño:");

        lblObservaciones.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblObservaciones.setText("Observaciones:");

        lblNombreMascotaDetalle.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lblRazaMascotaDetalle.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lblColorMascotaDetalle.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lblAlergicoDetalle.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lblAtencionDetalle.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lblNombreDuenoDetalle.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lblCelularDuenoDetalle.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lblDirrecionDuenoDetalle.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jScrollPane1.setBorder(null);

        txtObservaciones.setEditable(false);
        txtObservaciones.setColumns(20);
        txtObservaciones.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtObservaciones.setLineWrap(true);
        txtObservaciones.setRows(5);
        txtObservaciones.setToolTipText("");
        txtObservaciones.setWrapStyleWord(true);
        txtObservaciones.setBorder(null);
        txtObservaciones.setFocusable(false);
        txtObservaciones.setOpaque(false);
        jScrollPane1.setViewportView(txtObservaciones);

        javax.swing.GroupLayout PanelControlLayout = new javax.swing.GroupLayout(PanelControl);
        PanelControl.setLayout(PanelControlLayout);
        PanelControlLayout.setHorizontalGroup(
            PanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelControlLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(PanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDirrecionDueno, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblObservaciones, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCelularDueno, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombreDueno, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAtencionMascota, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAlergicoMascota, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblColorMascota, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblRazaMascota, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNombreMascota, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDirrecionDuenoDetalle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCelularDuenoDetalle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNombreDuenoDetalle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAtencionDetalle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAlergicoDetalle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblColorMascotaDetalle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRazaMascotaDetalle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNombreMascotaDetalle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelControlLayout.setVerticalGroup(
            PanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelControlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNombreMascota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNombreMascotaDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblRazaMascota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRazaMascotaDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblColorMascota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblColorMascotaDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAlergicoMascota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAlergicoDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAtencionMascota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAtencionDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNombreDueno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNombreDuenoDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCelularDueno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCelularDuenoDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDirrecionDueno)
                    .addComponent(lblDirrecionDuenoDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelControlLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelControlLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lblObservaciones)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(PanelControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelControl;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAlergicoDetalle;
    private javax.swing.JLabel lblAlergicoMascota;
    private javax.swing.JLabel lblAtencionDetalle;
    private javax.swing.JLabel lblAtencionMascota;
    private javax.swing.JLabel lblCelularDueno;
    private javax.swing.JLabel lblCelularDuenoDetalle;
    private javax.swing.JLabel lblColorMascota;
    private javax.swing.JLabel lblColorMascotaDetalle;
    private javax.swing.JLabel lblDirrecionDueno;
    private javax.swing.JLabel lblDirrecionDuenoDetalle;
    private javax.swing.JLabel lblNombreDueno;
    private javax.swing.JLabel lblNombreDuenoDetalle;
    private javax.swing.JLabel lblNombreMascota;
    private javax.swing.JLabel lblNombreMascotaDetalle;
    private javax.swing.JLabel lblObservaciones;
    private javax.swing.JLabel lblRazaMascota;
    private javax.swing.JLabel lblRazaMascotaDetalle;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txtObservaciones;
    // End of variables declaration//GEN-END:variables
}
