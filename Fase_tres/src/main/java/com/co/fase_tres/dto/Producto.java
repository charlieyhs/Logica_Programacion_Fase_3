package com.co.fase_tres.dto;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Carlos Hernández
 * Clase encargada de almacenar los datos basicos y necesarios del producto para la exportación
 */
public class Producto {
    private String nombre;
    private int cantidad;
    private double peso;
    private String ciudadOrigen;
    private String ciudadDestino;
    public static final Map<String, String> mapaCiudades = new HashMap<>();
    
    static{
        mapaCiudades.put("USA", "Estados Unidos");
        mapaCiudades.put("ES", "España");
        mapaCiudades.put("ITALIA", "Italia");
        mapaCiudades.put("FRANCIA", "Francia");
        mapaCiudades.put("ALEMANIA", "Alemania");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }
    
}
