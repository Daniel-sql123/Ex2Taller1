/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Inscripciones;

import Modelo.Participante.Participantes;
import Modelo.Taller.Taller;
import java.sql.Date;

/**
 *
 * @author Student DaniTini
 */
public class InscripcionesDTO {
    private final int id;
    private final String taller;
    private final String participante;
    private final Date fecha;
    private final String asistencia;

    public int getId() {
        return id;
    }

    public String getTaller() {
        return taller;
    }

    public String getParticipante() {
        return participante;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getAsistencia() {
        return asistencia;
    }

    public InscripcionesDTO(int id, String taller, String participate, Date fecha, String asistencia) {
        this.id = id;
        this.taller = taller;
        this.participante = participate;
        this.fecha = fecha;
        this.asistencia = asistencia;
    }
    
}
