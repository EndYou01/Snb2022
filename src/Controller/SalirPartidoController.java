
package Controller;

import View.VentanaESalirPartido;

/**
 *
 * @author End_You
 */
public class SalirPartidoController {
    public static VentanaESalirPartido ventana = new VentanaESalirPartido();
    public static void Mostrar(){ventana.setVisible(true);}
    public static void Ocultar(){ventana.setVisible(false);}
    
    public static void eventoBotonMenu(){
        Ocultar();
        FinJuegoController.Mostrar();
    }
    public static void eventoBotonJuego(){
        Ocultar();
        SalirJuegoController2.Mostrar();
        
        
    }
    public static void eventoBotonAtras(){
        Ocultar();
        PrincipalController.Descongelar();
        
    }
}
