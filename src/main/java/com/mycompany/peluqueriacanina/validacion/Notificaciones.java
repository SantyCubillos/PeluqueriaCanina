package com.mycompany.peluqueriacanina.validacion;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Notificaciones {
    
    public void RegistroExitoso(String NomMascota, String RazMascota){
        ImageIcon ImgRegistroExitoso = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/ico-confirmacion.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        JOptionPane.showMessageDialog(null, "Los datos de: " + NomMascota + " de raza " + RazMascota + " se han registrado con éxito", "Registro Exitoso", JOptionPane.PLAIN_MESSAGE, ImgRegistroExitoso);
    }
    
    public void ActulizacionExitosa(String NomMascota, String RazMascota){
        ImageIcon ImgActulizacionExitosa = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/ico-confirmacion.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        JOptionPane.showMessageDialog(null, "Los datos de: " + NomMascota + " de raza " + RazMascota + " se han actualizado con éxito", "Actualización Exitosa", JOptionPane.PLAIN_MESSAGE, ImgActulizacionExitosa);
    }
    
    public void CamposObligatorios(){
        ImageIcon ImgCamposObligatorios = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/ico-error.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        JOptionPane.showMessageDialog(null, "Por favor, llene todos los campos obligatorios marcados en rojo", "Campos Obligatorios", JOptionPane.PLAIN_MESSAGE, ImgCamposObligatorios);
    }
    
    public void RegistroNoSeleccionado(){
        ImageIcon ImgRegistroNoSeleccionado = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/ico-info.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        JOptionPane.showMessageDialog(null, "Aún no has seleccionado una mascota de nuestra lista, por favor selecciona una para continuar.", "Registro no seleccionado", JOptionPane.PLAIN_MESSAGE, ImgRegistroNoSeleccionado);
    }
    
    public void SinRegistros(){
        ImageIcon ImgSinRegistros = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/ico-info.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        JOptionPane.showMessageDialog(null, "No hay mascotas registradas en nuestra bases de datos.", "Sin Registros", JOptionPane.PLAIN_MESSAGE, ImgSinRegistros);
    }

    public int ComfirmarEliminacion(String NomMascota, int CodMascota){
        UIManager.put("OptionPane.yesButtonText", "SI");
        UIManager.put("OptionPane.noButtonText", "NO");
        ImageIcon ImgComfirmarEliminacion = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/ico-info.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        int Comfirmar = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar los datos de: " + NomMascota + " con número de registro " + CodMascota, "Confirmar eliminación", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, ImgComfirmarEliminacion);
        return Comfirmar;
    }
    
    public void RegistroEliminado(String NomMascota, int CodMascota){
        ImageIcon ImgRegistroEliminado = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/ico-confirmacion.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        JOptionPane.showMessageDialog(null, "Los datos de: " + NomMascota + " con número de registro " + CodMascota + " se han eliminado con éxito", "Registro Eliminado", JOptionPane.PLAIN_MESSAGE, ImgRegistroEliminado);
    }
    
    public void SoloLetras(int max){
        ImageIcon ImgSoloLetras = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/ico-error.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        JOptionPane.showMessageDialog(null, "Por favor, ingrese un máximo de " + max + " caracteres. Solo se permiten letras, acentos y espacios internos.", "Solo Letras", JOptionPane.PLAIN_MESSAGE, ImgSoloLetras);
    }
    
    public void SoloNumeros(int max){
        ImageIcon ImgSoloNumeros = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/ico-error.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        JOptionPane.showMessageDialog(null, "Por favor, ingrese un máximo de " + max + " caracteres. Solo se permiten números.", "Solo números", JOptionPane.PLAIN_MESSAGE, ImgSoloNumeros);
    }
    
    public void Conexion(){
        ImageIcon ImgConexion = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/ico-error.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        JOptionPane.showMessageDialog(null, "Se ha producido un error de conexión con la base de datos. Por favor, compruebe que el servidor esté funcionando.", "Error de conexión", JOptionPane.PLAIN_MESSAGE, ImgConexion);
    }
}