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
    private Participantes participate;
    private LocalDate fecha;
    private boolean asistencia;

    public int getId() {
        return id;
    }

    public Taller getTaller() {
        return taller;
    }

    public Participantes getParticipate() {
        return participate;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public boolean isAsistencia() {
        return asistencia;
    }

    public void setParticipate(Participantes participate) {
        this.participate = participate;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }

    protected Inscripciones(int id, Taller taller, Participantes participate, LocalDate fecha, boolean asistencia) {
        this.id = id;
        this.taller = taller;
        this.participate = participate;
        this.fecha = fecha;
        this.asistencia = asistencia;
    }
    
     public Inscripciones( Taller taller, Participantes participate, LocalDate fecha, boolean asistencia) {
        this.id = 0;
        this.taller = taller;
        this.participate = participate;
        this.fecha = fecha;
        this.asistencia = asistencia;
    }
    
}
