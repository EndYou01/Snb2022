/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.VentanaESalirJuego;

/**
 *
 * @author End_You
 */
public class SalirJuegoController {
    public static VentanaESalirJuego ventana = new VentanaESalirJuego();
    public static void Mostrar(){ventana.setVisible(true);}
    public static void Ocultar(){ventana.setVisible(false);}
    
    
    public static void eventoBotonSi(){
        System.exit(0);
    }
    
    public static void eventoBotonNo(){
        Ocultar();
        MenuHomeController.Descongelar();
        MenuHomeController.Mostrar();
    }
}
