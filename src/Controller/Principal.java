
package Controller;

import View.VistaSplash;


public class Principal {
    
    public static void main(String[] args) {
        
        VistaSplash splash = new VistaSplash();//Inicializamos nuestro formulario splashsrc
        splash.setVisible(true);//Lo hacemos visible
        try{
            for(int i=0; i<=100;i++){//Iniciando ciclo de 0 a 100
                Thread.sleep(10);//Velocidad de Carga
                splash.getProgressBar().setValue(i);//Mostramos nuestro ciclo en funcion del ciclo for
                splash.getLblCarga().setText("Cargando... " + (Integer.toString(i)) + "%");//Mostramos mensaje y porcentaje de carga en nuestra etiqueta
                if(i == 100){//Si el valor es = a 100
                    splash.setVisible(false);//se cierra el splash
                    MenuHomeController.Mostrar();
                }
            }
            
        }catch (Exception e){
        
        }
    }
}
