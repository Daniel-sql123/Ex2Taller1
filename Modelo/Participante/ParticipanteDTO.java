/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Participante;

/**
 *
 * @author Student
 */
public class ParticipanteDTO {
    private final int cedula;
    private final String nombre;
    private final String telefono;
    private final String correo;

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public ParticipanteDTO(int cedula, String nombre, String telefono, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }
    
}
