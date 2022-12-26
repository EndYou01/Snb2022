/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.VentanaEAlineacion;

/**
 *
 * @author End_You
 */
public class EAlineacionController {
    public static VentanaEAlineacion ventana = new VentanaEAlineacion();
    public static void Mostrar(){ventana.setVisible(true);}
    public static void Ocultar(){ventana.setVisible(false);}
    
    public static void eventoBotonAtras(){
        Ocultar();
        PrincipalController.Descongelar();
    }
}
