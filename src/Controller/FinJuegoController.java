/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.VentanaEFinJuego;

/**
 *
 * @author End_You
 */
public class FinJuegoController {
    public static VentanaEFinJuego ventana = new VentanaEFinJuego();
    public static void Mostrar(){ventana.setVisible(true);}
    public static void Ocultar(){ventana.setVisible(false);}
    
    
    
    
    public static void eventoBotonContinuar(){
        Ocultar();
        PrincipalController.Descongelar();
        PrincipalController.Ocultar();
        MenuHomeController.Mostrar();
    }
}
