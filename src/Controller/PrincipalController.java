/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.VentanaEFinJuego;
import View.VentanaPrincipal;

/**
 *
 * @author End_You
 */
public class PrincipalController {
    public static VentanaPrincipal ventana = new VentanaPrincipal();
    public static void Mostrar(){ventana.setVisible(true);}
    public static void Ocultar(){ventana.setVisible(false);}
    public static void Congelar(){ventana.setEnabled(false);}
    public static void Descongelar(){ventana.setEnabled(true);}
    public static void MostrarPanelFinJuego(){ventana.getPanelFinJuego().setVisible(true);}
    public static void OcultarPanelFinJuego(){ventana.getPanelFinJuego().setVisible(false);}
    //Inicializacion de variables generales ------------------------------------------------------------------------------
        public static int Strike = 0;
        static int bola = 0;
        static int out = 0;
        static int ining = 1;
        static int carrerasE1 = 0;
        static int carrerasE2 = 0;
        static int HomerunE1 = 0;
        static int HomerunE2 = 0;
        static int HitsE1 = 0;
        static int HitsE2 = 0;
        static int DoblesE1 = 0;
        static int DoblesE2 = 0;
        static int TriplesE1 = 0;
        static int TriplesE2 = 0;
        static int ErrorE1 = 0;
        static int ErrorE2 = 0;
        static boolean equipo1_al_bate = true;
        static int lanzamientos = 0;
        static int promedio = 25;
        static int Efectividad_Lanzamiento;
    
    public static void Mostrar1BE1(){ventana.getPrimeraBE1().setVisible(true);}
    public static void Ocultar1BE1(){ventana.getPrimeraBE1().setVisible(false);}
    public static void Mostrar2BE1(){ventana.getSegundaBE1().setVisible(true);}
    public static void Ocultar2BE1(){ventana.getSegundaBE1().setVisible(false);}
    public static void Mostrar3BE1(){ventana.getTerceraBE1().setVisible(true);}
    public static void Ocultar3BE1(){ventana.getTerceraBE1().setVisible(false);}
    
    public static void Mostrar1BE2(){ventana.getPrimeraBE2().setVisible(true);}
    public static void Ocultar1BE2(){ventana.getPrimeraBE2().setVisible(false);}
    public static void Mostrar2BE2(){ventana.getSegundaBE2().setVisible(true);}
    public static void Ocultar2BE2(){ventana.getSegundaBE2().setVisible(false);}
    public static void Mostrar3BE2(){ventana.getTerceraBE2().setVisible(true);}
    public static void Ocultar3BE2(){ventana.getTerceraBE2().setVisible(false);}
    
    public static void MostrarPitcherE1(){ventana.getPitcherE1().setVisible(true);}
    public static void OcultarPitcherE1(){ventana.getPitcherE1().setVisible(false);}
    public static void MostrarPitcherE2(){ventana.getPitcherE2().setVisible(true);}
    public static void OcultarPitcherE2(){ventana.getPitcherE2().setVisible(false);}
    
    public static void MostrarPrincipioIning(){ventana.getPrincipioIning().setVisible(true);}
    public static void OcultarPrincipioIning(){ventana.getPrincipioIning().setVisible(false);}
    public static void MostrarFinalIning(){ventana.getFinalIning().setVisible(true);}
    public static void OcultarFinalIning(){ventana.getFinalIning().setVisible(false);}
    
    
    
    
    public static void eventoBotonSalirPartido(){
        Congelar();
        SalirPartidoController.Mostrar();
    }
    
   
    
    public static void eventoBotonEmpezarPartida(){
        //Lanzamiento --------------------------------------------------------------------------------------------------
        int auxiliar = (int)(Math.random() * (100 - 1) + 1);
        int tipoLanzamiento = (int)(Math.random() * (6 - 0) + 0);
        lanzamientos++;
        ventana.getLblLanzamientosPitcher().setText(String.valueOf(lanzamientos));
        
        //Aqui se debe coger de la BD la cantidad maxima de lanzamientos del pitcher
        int max_lanzamientos = 120; //Ejemplo
        if(lanzamientos == max_lanzamientos/2){
            promedio+=10;
        }
        if(lanzamientos == max_lanzamientos){
            promedio+=10;
        }
        
        //Bola -----------------------------------------------------------------------------------------------------------        
            if(auxiliar <= promedio){
                bola ++;
                if(bola == 4){
                    ventana.getTxtPizarra().setText("B.P.B");
                    if(equipo1_al_bate == false){
                         if(ventana.getTerceraBE2().isVisible() && ventana.getSegundaBE2().isVisible() && ventana.getPrimeraBE2().isVisible()){
                                carrerasE2++;
                                ventana.getLblCarreraE2().setText(String.valueOf(carrerasE2));
                            }else
                            if(ventana.getPrimeraBE2().isVisible() && ventana.getSegundaBE2().isVisible()){
                                Mostrar3BE2();
                            }else
                            if(ventana.getPrimeraBE2().isVisible()){
                                Mostrar2BE2();
                                }
                        Mostrar1BE2();
                        ReiniciarMarcador_Strikes_Bolas();      
                        }else if(equipo1_al_bate){
                            if(ventana.getTerceraBE1().isVisible() && ventana.getSegundaBE1().isVisible() && ventana.getPrimeraBE1().isVisible()){
                                carrerasE1++;
                                ventana.getLblCarreraE1().setText(String.valueOf(carrerasE1));
                            }else
                            if(ventana.getPrimeraBE1().isVisible() && ventana.getSegundaBE1().isVisible()){
                                Mostrar3BE1();
                            }else
                            if(ventana.getPrimeraBE1().isVisible()){
                                Mostrar2BE1();
                                }
                        Mostrar1BE1();
                        ReiniciarMarcador_Strikes_Bolas();
                        }
                }else{
                    ventana.getTxtPizarra().setText("Bola");
                    ventana.getLblBolas().setText(String.valueOf(bola));
                }
                
        //Waypitch --------------------------------------------------------------------------------------------------------        
            }else if(auxiliar > 25 && auxiliar <= 30){
                ventana.getTxtPizarra().setText("WayPitch");
                jugadaHit();
            }else{
                
                //String lanzaminetos[]= {"Slider", "Recta", "Curva", "Cambio", "Tenedor", "Screwball", "Sinker"};
                
                int efectividadAbridor[] = {5, 5, 5, 4, 4, 0, 0};
                int efectividadRelevista[] = {4, 4, 4, 2, 2, 2, 0};
                int efectividadCerrador[] = {5, 2, 2, 2, 2, 2, 2};
                //Se pasa de la BD el tipo de pitcher y se le asigna a selected
                int selected[] = efectividadAbridor; //Ejemplo
                int efectividad[] = fisher_yates(selected);
                
                Efectividad_Lanzamiento = efectividad[tipoLanzamiento];
                if(lanzamientos >= max_lanzamientos){
                    Efectividad_Lanzamiento--;
                }else
                if(lanzamientos >= max_lanzamientos/2){
                    Efectividad_Lanzamiento--; 
                }
                //System.out.println("Efectividad del lanzamiento: "+Efectividad_Lanzamiento);
                
        //Bateo --------------------------------------------------------------------------------------------------------    
                //Aqui se le pasaria de la BD el tipo de bateador al bate y la fuerza, se asignaria su arreglo correspondiente y a una variable correspondiente
                //selected
                int poderFuerza[] = {5, 5, 2, 0, 0, 0, 0};
                int poderTacto[] = {3, 3, 2, 2, 1, 0, 0};
                int poderBajoRendimineto[] = {2, 2, 0, 0, 0, 0, 0};
                int fuerzaBateadorFuerza = (int) (Math.random() * (5 - 4)+4);
                //System.out.println("Fuerza: "+fuerzaBateadorFuerza);
                int fuerzaBateadorTacto = (int) (Math.random() * (4 - 3)+3);
                int fuerzaBateadorBRendimineto = (int) (Math.random() * (3 - 2)+2);

                //Se iguala el array correspondinete a arr y la fuerza correspondiente a fuerza selected
                //Se trabaja con el array corresponidente
                int fuerzaSelected = fuerzaBateadorFuerza;//Ejemplo
                int selected2[] = poderFuerza; //Ejemplo

                int poder[] = fisher_yates(selected2);
                int poder_al_bate = poder[tipoLanzamiento];
                //System.out.println("Poder al Bate: "+poder_al_bate);

        //Realizar Jugada  
        //Strike--------------------------------------------------------------------------------------------------
                int valor = poder_al_bate * fuerzaSelected - Efectividad_Lanzamiento;
                
                if(valor >= -5 && valor <= 1){
                    ventana.getTxtPizarra().setText("Strike");
                    Strike ++;
                    ventana.getLblStrikes().setText(String.valueOf(Strike));
                    if(Strike == 3){
                        ReiniciarMarcador_Strikes_Bolas();
                        out++;
                        ventana.getLblOuts().setText(String.valueOf(out));
                    }
                }else
        //Hits--------------------------------------------------------------------------------------------------------------------
                if(valor >= 2 && valor <= 5){
                    ventana.getTxtPizarra().setText("Hit");
                    jugadaHit();
                    
                    
        //Foul--------------------------------------------------------------------------------------------------------------    
                }else
                if(valor >= 6 && valor <= 9){
                    ventana.getTxtPizarra().setText("Foul");
                    if(Strike < 2){
                        Strike ++;
                        ventana.getLblStrikes().setText(String.valueOf(Strike));
                    }
        //Doble-----------------------------------------------------------------------------------------------------------------
                }else
                if(valor >= 10 && valor <= 13){
                    ventana.getTxtPizarra().setText("Doble");
                    if(equipo1_al_bate == false){
                         if(ventana.getTerceraBE2().isVisible() && ventana.getSegundaBE2().isVisible() && ventana.getPrimeraBE2().isVisible()){
                                carrerasE2+=2;
                                ventana.getLblCarreraE2().setText(String.valueOf(carrerasE2));
                                Ocultar1BE2();
                            }else
                            if(ventana.getTerceraBE2().isVisible() && ventana.getSegundaBE2().isVisible()){
                                Ocultar3BE2();
                                carrerasE2+=2;
                                ventana.getLblCarreraE2().setText(String.valueOf(carrerasE2));
                            }else
                            if(ventana.getPrimeraBE2().isVisible() && ventana.getSegundaBE2().isVisible()){
                                Ocultar1BE2();
                                Mostrar3BE2();
                                CarrerasE2mas1();
                            }else
                            if(ventana.getTerceraBE2().isVisible()){
                                Ocultar3BE2();
                                CarrerasE2mas1();
                            }else
                            if(ventana.getSegundaBE2().isVisible()){
                                CarrerasE2mas1();
                            }else
                            if(ventana.getPrimeraBE2().isVisible()){
                                Mostrar3BE2();
                                Ocultar1BE2();
                                }
                        Mostrar2BE2();
                        DoblesE2++;
                        ventana.getLblDobleE2().setText(String.valueOf(DoblesE2));
                        ReiniciarMarcador_Strikes_Bolas();       
                        }else if(equipo1_al_bate){
                            if(ventana.getTerceraBE1().isVisible() && ventana.getSegundaBE1().isVisible() && ventana.getPrimeraBE1().isVisible()){
                                carrerasE1+=2;
                                ventana.getLblCarreraE1().setText(String.valueOf(carrerasE1));
                                Ocultar1BE1();
                            }else
                            if(ventana.getTerceraBE1().isVisible() && ventana.getSegundaBE1().isVisible()){
                               Ocultar3BE1();
                                carrerasE1+=2;
                                ventana.getLblCarreraE1().setText(String.valueOf(carrerasE1));
                            }else
                            if(ventana.getPrimeraBE1().isVisible() && ventana.getSegundaBE1().isVisible()){
                                Ocultar1BE1();
                                Mostrar3BE1();
                                CarrerasE1mas1();
                            }else
                            if(ventana.getTerceraBE1().isVisible()){
                                Ocultar3BE1();
                                CarrerasE1mas1();
                            }else
                            if(ventana.getSegundaBE1().isVisible()){
                                CarrerasE1mas1();
                            }else
                            if(ventana.getPrimeraBE1().isVisible()){
                                Mostrar3BE1();
                                Ocultar1BE1();
                                }
                        Mostrar2BE1();
                        DoblesE1++;
                        ventana.getLblDobleE2().setText(String.valueOf(DoblesE1));
                        ReiniciarMarcador_Strikes_Bolas();
                        }
   
        //Rolling---------------------------------------------------------------------------------------------------------------    
                }else
                if(valor >= 14 && valor < 17){
                    int aux = (int) (Math.random()*(100 - 1)+1);
                    if(aux <= 5){
                        contadorErrores();
                        
                    }else{
                        ventana.getTxtPizarra().setText("Rolling");
                        jugadaHit();
                    }
                    ReiniciarMarcador_Strikes_Bolas();
                    
        //Triple ----------------------------------------------------------------------------------------------------------------    
                }else
                if(valor >= 17 && valor <= 19){
                    ventana.getTxtPizarra().setText("Triple");
                    if(equipo1_al_bate == false){
                         if(ventana.getTerceraBE2().isVisible() && ventana.getSegundaBE2().isVisible() && ventana.getPrimeraBE2().isVisible()){
                                carrerasE2+=2;
                                ventana.getLblCarrerasTotalesE2().setText(String.valueOf(carrerasE2));
                                ventana.getLblCarreraE2().setText(String.valueOf(carrerasE2));
                                Ocultar1BE2();
                            }else
                            if(ventana.getTerceraBE2().isVisible() && ventana.getSegundaBE2().isVisible()){
                                Ocultar3BE2();
                                carrerasE2+=2;
                                ventana.getLblCarrerasTotalesE2().setText(String.valueOf(carrerasE2));
                                ventana.getLblCarreraE2().setText(String.valueOf(carrerasE2));
                            }else
                            if(ventana.getPrimeraBE2().isVisible() && ventana.getSegundaBE2().isVisible()){
                                Ocultar1BE2();
                                Mostrar3BE2();
                                CarrerasE2mas1();
                            }else
                            if(ventana.getTerceraBE2().isVisible()){
                                Ocultar3BE2();
                                CarrerasE2mas1();
                            }else
                            if(ventana.getSegundaBE2().isVisible()){
                                CarrerasE2mas1();
                            }else
                            if(ventana.getPrimeraBE2().isVisible()){
                                Mostrar3BE2();
                                Ocultar1BE2();
                                }
                        Mostrar2BE2();
                        TriplesE2++;
                        ventana.getLblDobleE2().setText(String.valueOf(TriplesE2));
                        ReiniciarMarcador_Strikes_Bolas();       
                        }else if(equipo1_al_bate){
                            if(ventana.getTerceraBE1().isVisible() && ventana.getSegundaBE1().isVisible() && ventana.getPrimeraBE1().isVisible()){
                                carrerasE1+=2;
                                ventana.getLblCarrerasTotalesE1().setText(String.valueOf(carrerasE1));
                                ventana.getLblCarreraE1().setText(String.valueOf(carrerasE1));
                                Ocultar1BE1();
                            }else
                            if(ventana.getTerceraBE1().isVisible() && ventana.getSegundaBE1().isVisible()){
                               Ocultar3BE1();
                                carrerasE1+=2;
                                ventana.getLblCarrerasTotalesE1().setText(String.valueOf(carrerasE1));
                                ventana.getLblCarreraE1().setText(String.valueOf(carrerasE1));
                            }else
                            if(ventana.getPrimeraBE1().isVisible() && ventana.getSegundaBE1().isVisible()){
                                Ocultar1BE1();
                                Mostrar3BE1();
                                CarrerasE1mas1();
                            }else
                            if(ventana.getTerceraBE1().isVisible()){
                                Ocultar3BE1();
                                CarrerasE1mas1();
                            }else
                            if(ventana.getSegundaBE1().isVisible()){
                                CarrerasE1mas1();
                            }else
                            if(ventana.getPrimeraBE1().isVisible()){
                                Mostrar3BE1();
                                Ocultar1BE1();
                                }
                        Mostrar2BE1();
                        TriplesE1++;
                        ventana.getLblTriplesE1().setText(String.valueOf(TriplesE1));
                        ReiniciarMarcador_Strikes_Bolas();
                        }
                    
        //Fly --------------------------------------------------------------------------------------------------------------------    
                }else
                if(valor >= 20 && valor <= 23){
                    int aux = (int) (Math.random()*(100 - 1)+1);
                    if(aux <= 5){
                        contadorErrores();
                    }else{
                        ventana.getTxtPizarra().setText("Fly");
                        jugadaHit();
                    }
                    ReiniciarMarcador_Strikes_Bolas();
        //Homerun ---------------------------------------------------------------------------------------------------------------------
                }else
                if(valor >= 24 && valor <= 27){
                    ventana.getTxtPizarra().setText("Homerun");
                    if(equipo1_al_bate == false){
                            if(ventana.getTerceraBE2().isVisible()){
                                Ocultar3BE2();
                                CarrerasE2mas1();
                            }
                            if(ventana.getSegundaBE2().isVisible()){
                               Ocultar2BE2();
                                CarrerasE2mas1();
                            }
                            if(ventana.getPrimeraBE2().isVisible()){
                                Ocultar1BE2();
                                CarrerasE2mas1();
                                }
                        HomerunE2++;
                        ventana.getLblHomerunE2().setText(String.valueOf(HomerunE2));
                        ReiniciarMarcador_Strikes_Bolas();      
                        }else if(equipo1_al_bate){
                            if(ventana.getTerceraBE1().isVisible()){
                                Ocultar3BE1();
                                CarrerasE1mas1();
                            }
                            if(ventana.getSegundaBE1().isVisible()){
                                Ocultar2BE1();
                                CarrerasE1mas1();
                            }
                            if(ventana.getPrimeraBE1().isVisible()){
                                Ocultar1BE1();
                                CarrerasE1mas1();
                                }
                        HomerunE1++;
                        ventana.getLblHomerunE1().setText(String.valueOf(HomerunE1));
                        ReiniciarMarcador_Strikes_Bolas();
                        }
                }
        //Control del Marcador ----------------------------------------------------------------------------------------------------
                            if(out == 3){
                            out = 0;
                            ventana.getLblOuts().setText(String.valueOf(out));
                            if(equipo1_al_bate == false){
                                OcultarTerreno();
                                OcultarPitcherE1();
                                MostrarPitcherE2();
                                equipo1_al_bate = true;
                            }else if(equipo1_al_bate){
                                OcultarTerreno();
                                OcultarPitcherE2();
                                MostrarPitcherE1();
                                equipo1_al_bate = false;
                            }
                                if(ventana.getPrincipioIning().isVisible()){
                                    OcultarPrincipioIning();
                                    MostrarFinalIning();
                                }else if(ventana.getFinalIning().isVisible()){
                                    ining++;
                                    OcultarFinalIning();
                                    MostrarPrincipioIning();
                                    ventana.getLblIning().setText(String.valueOf(ining));
                                    if(ining == 2){
                                        ventana.getTxtPizarra().setText("Fin del Partido");
                                        ventana.getRealizarJugada().setEnabled(false);
                                        ventana.getAlineacion().setEnabled(false);
                                        ventana.getSalir().setEnabled(false);
                                        MostrarPanelFinJuego();
                                        
                                        
                                        
                                    }
                            }
                        }
            }
    }
    
     public static int[] fisher_yates(int[] arreglo) {
    // recorremos todo el arreglo
    for(int i = arreglo.length - 1; i > 0; i--) {
      // calculamos un índice aleatorio dentro del rango permitido
      int shuffled_index = (int)Math.floor(Math.random() * (i + 1));
      //guardamos el elemento que estamos iterando
      int tmp = arreglo[i];
      // asignamos el elemento aleatorio al índice iterado
      arreglo[i] = arreglo[shuffled_index];
      // asignamos el elemento iterado al índice aleatorio
      arreglo[shuffled_index] = tmp;
    }
    return arreglo;
  }
     
    // Hit -----------------------------------------------------------------------------------------------------------------------------
    private static void jugadaHit() {
        if(equipo1_al_bate == false){
                         if(ventana.getTerceraBE2().isVisible() && ventana.getSegundaBE2().isVisible() && ventana.getPrimeraBE2().isVisible()){
                                CarrerasE2mas1();
                            }else
                            if(ventana.getTerceraBE2().isVisible() && ventana.getSegundaBE2().isVisible()){
                                Ocultar2BE2();
                                CarrerasE2mas1();
                            }else
                            if(ventana.getPrimeraBE2().isVisible() && ventana.getSegundaBE2().isVisible()){
                                Mostrar3BE2();
                            }else
                            if(ventana.getTerceraBE2().isVisible()){
                                Ocultar3BE2();
                                CarrerasE2mas1();
                            }else
                            if(ventana.getSegundaBE2().isVisible()){
                                Mostrar3BE2();
                                Ocultar2BE2();
                            }else
                            if(ventana.getPrimeraBE2().isVisible()){
                                Mostrar2BE2();
                                }
                        Mostrar1BE2();
                        HitsE2++;
                        ventana.getLblHitsE2().setText(String.valueOf(HitsE2));
                        ReiniciarMarcador_Strikes_Bolas();      
                        }else if(equipo1_al_bate){
                            if(ventana.getTerceraBE1().isVisible() && ventana.getSegundaBE1().isVisible() && ventana.getPrimeraBE1().isVisible()){
                                CarrerasE1mas1();
                            }else
                            if(ventana.getTerceraBE1().isVisible() && ventana.getSegundaBE1().isVisible()){
                                Ocultar2BE1();
                                CarrerasE1mas1();
                            }else
                            if(ventana.getPrimeraBE1().isVisible() && ventana.getSegundaBE1().isVisible()){
                                Mostrar3BE1();
                            }else
                            if(ventana.getTerceraBE1().isVisible()){
                                Ocultar3BE1();
                                CarrerasE1mas1();
                            }else
                            if(ventana.getSegundaBE1().isVisible()){
                                Mostrar3BE1();
                                Ocultar2BE1();
                            }else
                            if(ventana.getPrimeraBE1().isVisible()){
                                Mostrar2BE1();
                                }
                        Mostrar1BE1();
                        HitsE1++;
                        ventana.getLblHitsE1().setText(String.valueOf(HitsE1));
                        ReiniciarMarcador_Strikes_Bolas();
                        }
    }
    
    private static void ReiniciarMarcador_Strikes_Bolas(){
        Strike = 0;
        bola = 0; 
        ventana.getLblStrikes().setText(String.valueOf(Strike));
        ventana.getLblBolas().setText(String.valueOf(bola));
    }
    
    private static void OcultarTerreno(){
        Ocultar1BE1();
        Ocultar2BE1();
        Ocultar3BE1();
        Ocultar1BE2();
        Ocultar2BE2();
        Ocultar3BE2();
    }
    
    private static void CarrerasE2mas1(){
        carrerasE2++;
        ventana.getLblCarrerasTotalesE2().setText(String.valueOf(carrerasE2));
        ventana.getLblCarreraE2().setText(String.valueOf(carrerasE2));
    }
    private static void CarrerasE1mas1(){
        carrerasE1++;
        ventana.getLblCarrerasTotalesE1().setText(String.valueOf(carrerasE1));
        ventana.getLblCarreraE1().setText(String.valueOf(carrerasE1));
    }
    
    private static void contadorErrores(){
        if(equipo1_al_bate == false){
                            ventana.getTxtPizarra().setText("Out");
                            out++;
                            ErrorE2++;
                            ventana.getLblErroresE2().setText(String.valueOf(ErrorE2));
                            ventana.getLblOuts().setText(String.valueOf(out));
                        }
                        if(equipo1_al_bate){
                            ventana.getTxtPizarra().setText("Out");
                            out++;
                            ErrorE1++;
                            ventana.getLblErroresE1().setText(String.valueOf(ErrorE1));
                            ventana.getLblOuts().setText(String.valueOf(out));
                        }
    }
    
    public static void eventoBotonAlineacion(){
    Congelar();
    EAlineacionController.Mostrar();
    }
    
    public static void eventoBotonContinuar(){
        ventana.getRealizarJugada().setEnabled(true);
        ventana.getAlineacion().setEnabled(true);
        ventana.getSalir().setEnabled(true);
        ventana.getTxtPizarra().setText("");
        PrincipalController.Ocultar();
        MenuHomeController.Mostrar();
    }

}
