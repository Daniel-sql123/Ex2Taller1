/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Participante;

import Dao.Dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Student
 */
public class ParticipantesDAO extends Dao<ParticipanteDTO> {

    @Override
    public boolean create(ParticipanteDTO dto) throws SQLException {
        if (dto == null || !validatePK(dto.getCedula())) {
            return false;
        }
        String query = "Call CustomerCreate(?,?,?,?,?)";
        try ( PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, dto.getCedula());
            stmt.setString(2, dto.getNombre());
            stmt.setString(3, dto.getTelefono());
            stmt.setString(4, dto.getCorreo());
            return stmt.executeUpdate() > 0;
        }
    }

    @Override
    public ParticipanteDTO read(Object cedula) throws SQLException {
        if (cedula == null || String.valueOf(cedula).trim().isEmpty()) {
            return null;
        }
        String query = "Call CustomerRead(?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, String.valueOf(cedula));
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new ParticipanteDTO(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4));                      
                }
            }
        }
        return null;
    }

    @Override
    public List<ParticipanteDTO> readAll() throws SQLException {
  String query = "Call CustomerReadAll()";
        List<ParticipanteDTO> list = new ArrayList<>();
        try (PreparedStatement stmt = connection.prepareStatement(query)) {

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    list.add(new ParticipanteDTO(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4))); 
                }
            }
        }
        return list;    }

    @Override
    public boolean update(ParticipanteDTO dto) throws SQLException {
           if (dto == null) {
            return false;
        }
        String query = "Call CustomerUpdate(?,?,?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, dto.getCedula());
            stmt.setString(2, dto.getNombre());
            stmt.setString(3, dto.getTelefono());
            return stmt.executeUpdate() > 0;

        }
    }

    @Override
    public boolean delete(Object cedula) throws SQLException {
         if (cedula == null || String.valueOf(cedula).trim().isEmpty()) {
            return false;
        }
        String query = "Call CustomerDelete(?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, String.valueOf(cedula));
            return stmt.executeUpdate() > 0;

        }
    }

    public boolean validatePK(Object cedula) throws SQLException {
        return read(cedula) == null;
    }

}
