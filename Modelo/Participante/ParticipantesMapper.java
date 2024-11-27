/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Participante;

import Mapper.Mapper;

/**
 *
 * @author Student
 */
public class ParticipantesMapper implements Mapper<Participantes, ParticipanteDTO>{

    @Override
    public ParticipanteDTO toDTO(Participantes ent) {
        return new ParticipanteDTO(
                ent.getCedula(),
                ent.getNombre(),
                ent.getTelefono(),
                ent.getCorreo());
    }

    @Override
    public Participantes toEnt(ParticipanteDTO dto) {
         return new Participantes(
                dto.getCedula(),
                dto.getNombre(),
                dto.getTelefono(),
                dto.getCorreo());
    }
    
}
