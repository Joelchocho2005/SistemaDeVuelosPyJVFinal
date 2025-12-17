package com.PyJVuelos.persistencia.modelos.entidades;

public class UsuarioEntidad {
    private int idUsuario;
    private String nombreUsuario;
    private String emailUsuario;
    private String contraUsuario;

    public UsuarioEntidad(int idUsuario, String nombreUsuario, String emailUsuario, String contraUsuario) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.emailUsuario = emailUsuario;
        this.contraUsuario = contraUsuario;
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
