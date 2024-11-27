/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Inscripciones;

import Mapper.Mapper;
import Modelo.Taller.Taller;
import Modelo.Taller.TallerDTO;
import Utils.UtilDate;

/**
 *
 * @author Student
 */
public class InscripcionesMapper implements Mapper<Inscripciones, InscripcionesDTO>{

    @Override
    public InscripcionesDTO toDTO(Inscripciones ent) {
        return new InscripcionesDTO(
                ent.getId(),
                ent.getTaller().getCapacidad(),
                ent.getParticipate().getCorreo(),
                UtilDate.toSqlDate(ent.getFecha()),
                ent.getAsistencia());
    }

    @Override
    public Inscripciones toEnt(InscripcionesDTO dto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
