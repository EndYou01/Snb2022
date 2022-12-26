
package Model;


public class Jugadores extends Equipo{
    private int numero;
    private String nombre;
    private double errores_por_juego;
    private int errores_vida;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getErrores_por_juego() {
        return errores_por_juego;
    }

    public void setErrores_por_juego(double errores_por_juego) {
        this.errores_por_juego = errores_por_juego;
    }

    public int getErrores_vida() {
        return errores_vida;
    }

    public void setErrores_vida(int errores_vida) {
        this.errores_vida = errores_vida;
    }
    
    
}
