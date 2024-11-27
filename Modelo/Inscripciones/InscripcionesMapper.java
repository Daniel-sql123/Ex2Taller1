/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Inscripciones;

import Mapper.Mapper;
import Modelo.Participante.ParticipantesDAO;
import Modelo.Participante.ParticipantesMapper;
import Modelo.Taller.Taller;
import Modelo.Taller.TallerDAO;
import Modelo.Taller.TallerDTO;
import Modelo.Taller.TallerMapper;
import Utils.UtilDate;
import java.sql.SQLException;

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
                ent.getParticipante().getCorreo(),
                UtilDate.toSqlDate(ent.getFecha()),
                ent.getAsistencia());
    }

    @Override
    public Inscripciones toEnt(InscripcionesDTO dto) {
        try{
            return new Inscripciones(
                dto.getId(),
                new TallerMapper().toEnt(new TallerDAO(DataBase.DataBase.getConnection()).read(dto.getTaller())),
                new ParticipantesMapper().toEnt(new ParticipantesDAO(DataBase.DataBase.getConnection()).read(dto.getParticipante())),
                UtilDate.toLocalDate(dto.getFecha()),
                dto.getAsistencia());
        }catch (SQLException ex) {
            throw new RuntimeException("Error while mapping RentalContractDTO to RentalContract", ex);
        }
    }
    
}
