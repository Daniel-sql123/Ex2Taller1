/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Taller;

import java.time.LocalDate;

/**
 *
 * @author Student dash
 */
public class Taller {
    private int id;
    private String nombre;
    private LocalDate fecha;
    private String lugar;
    private String capacidad;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    protected Taller(int id, String nombre, LocalDate fecha, String lugar, String capacidad) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.capacidad = capacidad;
    }

    public Taller(String nombre, LocalDate fecha, String lugar, String capacidad) {
        this.id = 0;
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.capacidad = capacidad;
    }
    
    
    
}
