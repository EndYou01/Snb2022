/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.VistaNuevoEquipo;
import javax.swing.JOptionPane;

/**
 *
 * @author End_You
 */
public class NuevoEquipoController {
    public static VistaNuevoEquipo ventana = new VistaNuevoEquipo();
    public static void Mostrar(){ventana.setVisible(true);}
    public static void Ocultar(){ventana.setVisible(false);}
    
    public static void eventoBotonAtras(){
        ventana.getTxtNombreEquipo().setEnabled(true);
        ventana.getTxtProvincia().setEnabled(true);
        ventana.getBtnIngresarEquipo().setEnabled(true);
        ventana.getTxtNombreJugador().setEnabled(false);
        ventana.getTxtNumeroJugador().setEnabled(false);
        ventana.getBtnIngresarJugador().setEnabled(false);
        ventana.getCboxPosicion().setEnabled(false);
        ventana.getCboxBateadores().setEnabled(false);
        Ocultar();
        JugarController.Mostrar();
        
    }
    
    public static void eventoBotonGuardar(){
        ventana.getTxtNombreEquipo().setEnabled(true);
        ventana.getTxtProvincia().setEnabled(true);
        ventana.getBtnIngresarEquipo().setEnabled(true);
        ventana.getTxtNombreJugador().setEnabled(false);
        ventana.getTxtNumeroJugador().setEnabled(false);
        ventana.getBtnIngresarJugador().setEnabled(false);
        ventana.getCboxPosicion().setEnabled(false);
        ventana.getCboxBateadores().setEnabled(false);
        Ocultar();
        JugarController.Mostrar();
    }
    
    public static void eventoCBoxPosicion(){
        String posicion = ventana.getCboxPosicion().getSelectedItem().toString();
        
          
        if(posicion == "Jugador de Cuadro" || posicion == "Jardinero" || posicion == "Receptor"){
            ventana.getCboxBateadores().setEnabled(true);
            ventana.getCboxPitchers().setEnabled(false);
        }
        if(posicion == "Pitcher"){
            ventana.getCboxBateadores().setEnabled(false);
            ventana.getCboxPitchers().setEnabled(true);
        }
       
        
    }
    
    public static void eventoBotonIngresarEquipo(){
        if(ventana.getTxtNombreEquipo().getText().isEmpty() || ventana.getTxtProvincia().getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Introduzca todos los datos del Equipo");
        }else{
        ventana.getTxtNombreJugador().setEnabled(true);
        ventana.getTxtNumeroJugador().setEnabled(true);
        ventana.getCboxPosicion().setEnabled(true);
        ventana.getTxtNombreEquipo().setEnabled(false);
        ventana.getTxtProvincia().setEnabled(false);
        ventana.getBtnIngresarEquipo().setEnabled(false);
        ventana.getBtnIngresarJugador().setEnabled(true);
        ventana.getCboxBateadores().setEnabled(true);
        }
    }
    
    public static void eventoBotonIngresarJugador(){
         if(ventana.getTxtNumeroJugador().getText().isEmpty() || ventana.getTxtNombreJugador().getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Introduzca todos los datos del jugador");
        }
    }
    
    
}
