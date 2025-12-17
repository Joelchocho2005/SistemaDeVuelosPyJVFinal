package com.PyJVuelos.persistencia.modelos.entidades;

public class ReservaEntidad {

    private int idReserva;
    private VueloEntidad vuelo;
    private UsuarioEntidad usuario;
    private AsientoEntidad asiento;

    public ReservaEntidad(VueloEntidad vuelo, UsuarioEntidad usuario, AsientoEntidad asiento) {
        this.vuelo = vuelo;
        this.usuario = usuario;
        this.asiento= asiento;
    }

    // Metodo formato para leer y escribir en archivos
     // escribir
     public String toFileStrig (){
        return idReserva + ";" + vuelo.getIdVuelo() +";" + usuario.getEmailUsuario() +";" + asiento.getIdAsiento() ;
     }


    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public VueloEntidad getVuelo() {
        return vuelo;
    }

    public void setVuelo(VueloEntidad vuelo) {
        this.vuelo = vuelo;
    }

    public UsuarioEntidad getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioEntidad usuario) {
        this.usuario = usuario;
    }

    public AsientoEntidad getAsiento() {
        return asiento;
    }

    public void setAsiento(AsientoEntidad asiento) {
        this.asiento = asiento;
    }


}
