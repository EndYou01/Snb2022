/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.VistaMenuHome;

/**
 *
 * @author End_You
 */
public class MenuHomeController {
    public static VistaMenuHome v = new VistaMenuHome();
    public static void Mostrar(){v.setVisible(true);}
    public static void Ocultar(){v.setVisible(false);}
    public static void Congelar(){v.setEnabled(false);}
    public static void Descongelar(){v.setEnabled(true);}
    
    public static void eventoBotonJugar(){
        Ocultar();
        JugarController.Mostrar();
    }
    
    
    public static void eventoBotonOpciones(){
        Ocultar();
        CreditosController.Mostrar();
    }
    
    public static void eventoBotonSalir(){
        Congelar();
        SalirJuegoController.Mostrar();
    }
}
