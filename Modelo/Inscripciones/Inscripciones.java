/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Inscripciones;

import Modelo.Participante.Participantes;
import Modelo.Taller.Taller;
import java.time.LocalDate;

/**
 *
 * @author Student DaniTini
 */
public class Inscripciones {
    private int id;
    private Taller taller;
    private Participantes participante;
    private LocalDate fecha;
    private String asistencia;

    public int getId() {
        return id;
    }

    public Taller getTaller() {
        return taller;
    }

    public Participantes getParticipante() {
        return participante;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(String asistencia) {
        this.asistencia = asistencia;
    }

    protected Inscripciones(int id, Taller taller, Participantes participate, LocalDate fecha, String asistencia) {
        this.id = id;
        this.taller = taller;
        this.participante = participate;
        this.fecha = fecha;
        this.asistencia = asistencia;
    }
     public Inscripciones( Taller taller, Participantes participate, LocalDate fecha, String asistencia) {
        this.id = 0;
        this.taller = taller;
        this.participante = participate;
        this.fecha = fecha;
        this.asistencia = asistencia;
    }
    
}
