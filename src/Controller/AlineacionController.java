/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.VistaAlineacion;

/**
 *
 * @author End_You
 */
public class AlineacionController {
    public static VistaAlineacion ventana = new VistaAlineacion();
    public static void Mostrar(){ventana.setVisible(true);}
    public static void Ocultar(){ventana.setVisible(false);}
    
    
    
    public static void eventoBotonAtras(){
        Ocultar();
        JugarController.Mostrar();
    }
    
    public static void eventoBotonContinuar(){
        Ocultar();
        PrincipalController.Ocultar1BE1();
        PrincipalController.Ocultar1BE2();
        PrincipalController.Ocultar2BE1();
        PrincipalController.Ocultar2BE2();
        PrincipalController.Ocultar1BE1();
        PrincipalController.Ocultar3BE2();
        PrincipalController.Ocultar3BE1();
        PrincipalController.OcultarPitcherE1();
        PrincipalController.OcultarFinalIning();
        PrincipalController.OcultarPanelFinJuego();
        
        PrincipalController.Mostrar();
    }
    
    
}
