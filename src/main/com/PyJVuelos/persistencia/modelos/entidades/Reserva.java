package com.PyJVuelos.persistencia.modelos.entidades;

public class Reserva {

    private int idReserva;
    private VueloEntidad vuelo;
    private UsuarioEntidad usuario;
    private AsientoEntidad asiento;

    public Reserva(VueloEntidad vuelo, UsuarioEntidad usuario, AsientoEntidad asiento) {
        this.vuelo = vuelo;
        this.usuario = usuario;
        this.asiento= asiento;
    }
}
