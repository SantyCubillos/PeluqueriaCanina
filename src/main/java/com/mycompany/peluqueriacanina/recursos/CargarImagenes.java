package com.mycompany.peluqueriacanina.recursos;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CargarImagenes extends javax.swing.JFrame{
    
    public void CargarIcono(JFrame frame){
        frame.setIconImage(new ImageIcon(frame.getClass().getResource("/Imagenes/ico-mascotas.png")).getImage());
    }
    
    public void CargarIconoJDialog(JDialog jdialog){
        jdialog.setIconImage(new ImageIcon(jdialog.getClass().getResource("/Imagenes/ico-mascotas.png")).getImage());
    }
    
    public void CargarLogo(JLabel label){
        ImageIcon imgLogo = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/logo.png")).getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH));
        label.setIcon(imgLogo);
    }
    
    public void CargarBotonCargarDatos(JButton button){
        ImageIcon imgCargarDatos = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/ico-mascotas.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
        button.setIcon(imgCargarDatos);
    }
    
    public void CargarBotonVisualizarDatos(JButton button){
        ImageIcon imgVisualizarDatos = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/ico-visualizar.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
        button.setIcon(imgVisualizarDatos);
    }
    
    public void CargarBotonSalir(JButton button){
        ImageIcon imgSalir = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/ico-salir.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
        button.setIcon(imgSalir);
    }
    
    public void CargarBotonLimpiar(JButton button){
        ImageIcon imgLimpiar = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/ico-limpiar.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
        button.setIcon(imgLimpiar);
    }
    
    public void CargarBotonGuardar(JButton button){
        ImageIcon imgGuardar = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/ico-guardar.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
        button.setIcon(imgGuardar);
    }
    
    public void CargarBotonVolver(JButton button){
        ImageIcon imgVolver = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/ico-salir.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
        button.setIcon(imgVolver);
    }
    
    public void CargarBotonEditar(JButton button){
        ImageIcon imgEdiar = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/ico-editar.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
        button.setIcon(imgEdiar);
    }
    
    public void CargarBotonEliminar(JButton button){
        ImageIcon imgEliminar = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/ico-eliminar.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
        button.setIcon(imgEliminar);
    }
    
    public void CargarBotonDetalles(JButton button){
        ImageIcon imgDetalles = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/ico-detalles.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH));
        button.setIcon(imgDetalles);
    }
}