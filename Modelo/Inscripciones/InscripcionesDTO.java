/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Inscripciones;

import Modelo.Participante.Participantes;
import Modelo.Taller.Taller;
import java.util.Date;

/**
 *
 * @author Student DaniTini
 */
public class InscripcionesDTO {
    private final int id;
    private final Taller taller;
    private final Participantes participate;
    private final Date fecha;
    private final boolean asistencia;

    public int getId() {
        return id;
    }

    public Taller getTaller() {
        return taller;
    }

    public Participantes getParticipate() {
        return participate;
    }

    public Date getFecha() {
        return fecha;
    }

    public boolean isAsistencia() {
        return asistencia;
    }

    public InscripcionesDTO(int id, Taller taller, Participantes participate, Date fecha, boolean asistencia) {
        this.id = id;
        this.taller = taller;
        this.participate = participate;
        this.fecha = fecha;
        this.asistencia = asistencia;
    }
    
}
