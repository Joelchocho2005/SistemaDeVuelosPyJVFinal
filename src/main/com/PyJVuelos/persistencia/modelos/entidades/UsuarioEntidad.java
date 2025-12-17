package com.PyJVuelos.persistencia.modelos.entidades;

import com.PyJVuelos.persistencia.modelos.entidades.enums.RolUsuario;

public class UsuarioEntidad {
    private int idUsuario;
    private String nombreUsuario;
    private String emailUsuario;
    private String contraUsuario;
    private RolUsuario rolUsuario;
    public UsuarioEntidad(int idUsuario, String nombreUsuario, String emailUsuario, String contraUsuario, RolUsuario Usuario) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.emailUsuario = emailUsuario;
        this.contraUsuario = contraUsuario;
        this.rolUsuario = Usuario;
    }
    //-----METODOS PARA LA CONVERSION DE OBJETOS A TEXTO Y VICEVERSA
    //Convierte nuestro objeto en las lineas propias para los archivos
    public String toFileString() {
        return idUsuario + ";" + nombreUsuario + ";" + emailUsuario + ";" + contraUsuario+";"+rolUsuario;
    }
    // Convierte "1;admin;1234;VENDEDOR" de vuelta a Objeto
    public static UsuarioEntidad fromFileString(String linea) {
        String[] partes = linea.split(";");
        int idUsuario = Integer.parseInt(partes[0]);
        String nombreUsuario = partes[1];
        String emailUsuario = partes[2];
        String contraUsuario = partes[3];
        RolUsuario rolUsuario = RolUsuario.valueOf(partes[4]); // Convierte texto a Enum
        return new UsuarioEntidad(idUsuario,nombreUsuario,emailUsuario, contraUsuario,rolUsuario);
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getContraUsuario() {
        return contraUsuario;
    }

    public void setContraUsuario(String contraUsuario) {
        this.contraUsuario = contraUsuario;
    }
}
