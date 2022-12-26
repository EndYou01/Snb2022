/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Alezzo
 */
public class Equipo {
    private String nombre;
    private String provincia;
    private int cant_JJ;
    private int juegos_ganados;
    private int juegos_perdidos;
    private double average;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCant_JJ() {
        return cant_JJ;
    }

    public void setCant_JJ(int cant_JJ) {
        this.cant_JJ= cant_JJ;
    }

    public int getJuegos_ganados() {
        return juegos_ganados;
    }

    public void setJuegos_ganados(int juegos_ganados) {
        this.juegos_ganados = juegos_ganados;
    }

    public int getJuegos_perdidos() {
        return juegos_perdidos;
    }

    public void setJuegos_perdidos(int juegos_perdidos) {
        this.juegos_perdidos = juegos_perdidos;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public int getErrores_T() {
        return errores_T;
    }

    public void setErrores_T(int errores_T) {
        this.errores_T = errores_T;
    }

    public double getErrores_x_juego() {
        return errores_x_juego;
    }

    public void setErrores_x_juego(double errores_x_juego) {
        this.errores_x_juego = errores_x_juego;
    }

    public double getPCL() {
        return PCL;
    }

    public void setPCL(double PCL) {
        this.PCL = PCL;
    }
    private int errores_T;
    private double errores_x_juego;
    private double PCL;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
}
