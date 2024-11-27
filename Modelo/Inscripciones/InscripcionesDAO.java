/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Inscripciones;

import Dao.Dao;
import DataBase.DataBase;
import Modelo.Participante.ParticipantesDAO;
import Modelo.Taller.TallerDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Student DaniTini
 */
public class InscripcionesDAO extends Dao<InscripcionesDTO> {

    public InscripcionesDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean create(InscripcionesDTO dto) throws SQLException {
        if (dto == null || !validateFkTaller(dto.getTaller()) || !validateFkParticipantes(dto.getParticipate())) {
            return false;
        }
        String query = "Call InscripcionesCreate(?,?,?,?)";
        try ( PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, dto.getId());
            stmt.setString(2, dto.getTaller());
            stmt.setString(3, dto.getParticipate());
            stmt.setDate(4, dto.getFecha());
            stmt.setString(5, dto.getAsistencia());
            return stmt.executeUpdate() == 1;
        }
    }

    @Override
    public InscripcionesDTO read(Object id) throws SQLException {
        if (id == null || String.valueOf(id).trim().isEmpty()) {
            return null;
        }
        String query = "Call Inscripcionesread(?)";
        try ( PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, (id));
            try ( ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new InscripcionesDTO(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getDate(4),
                            rs.getString(5));
                }
            }
        }
        return null;
    }

    @Override
    public List<InscripcionesDTO> readAll() throws SQLException {
        String query = "Call InscripcionesreadAll(?)";
        List<InscripcionesDTO> list = new ArrayList<>();
        try ( PreparedStatement stmt = connection.prepareStatement(query)) {
            try ( ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    list.add(new InscripcionesDTO(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getDate(4),
                            rs.getString(5)));
                }
            }
        }
        return list;
    }

    @Override
    public boolean update(InscripcionesDTO dto) throws SQLException {
        if(dto == null){
            return false;
        }
        String query = "Call InscripcionesUpdate(?)";
        try(PreparedStatement stmt = connection.prepareStatement(query)){
            stmt.setString(1, dto.getAsistencia());
            return stmt.executeUpdate() > 0;
        } 
    }

    @Override
    public boolean delete(Object id) throws SQLException {
        if (id == null || String.valueOf(id).trim().isEmpty()) {
            return false;
        }
        String query = "Call InscripcionesDelete(?)";
        try ( PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, String.valueOf(id));
            return stmt.executeUpdate() > 0;
        }
    }

    public boolean validateFkTaller(Object id) throws SQLException {
        return new TallerDAO(DataBase.getConnection()).read(id) != null;
    }

    public boolean validateFkParticipantes(Object cedula) throws SQLException {
        return new ParticipantesDAO(DataBase.getConnection()).read(cedula) != null;
    }

}
