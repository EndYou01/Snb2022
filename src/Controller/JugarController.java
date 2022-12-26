/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.VistaJugar;

/**
 *
 * @author End_You
 */
public class JugarController {
    public static VistaJugar ventana = new VistaJugar();
    public static void Mostrar(){ventana.setVisible(true);}
    public static void Ocultar(){ventana.setVisible(false);}
    
    public static void eventoBotonAtras(){
        Ocultar();
        MenuHomeController.Mostrar();
    }
    
    public static void eventoBotonNuevoEquipo(){
        Ocultar();
        NuevoEquipoController.Mostrar();
    }
    
    public static void eventoBotonContinuar(){
        Ocultar();
        AlineacionController.Mostrar();
    }
}
