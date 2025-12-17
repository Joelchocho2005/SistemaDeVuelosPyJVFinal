package com.PyJVuelos.persistencia.modelos.entidades;
import java.time.LocalDate;
import java.time.LocalTime;


public class VueloEntidad {

    private int idVuelo;
    private AvionEntidad avion;
    private String destino;
    private String origen;
    private LocalDate fecha;
    private LocalTime hora;

    public VueloEntidad(AvionEntidad avion, String destino, String origen, LocalDate fecha , LocalTime hora ) {
        this.avion = avion;
        this.destino = destino;
        this.origen = origen;
        this.fecha = fecha;
        this.hora = hora;

    }
    public int getIdVuelo() {
        return idVuelo;
    }
    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }
    public AvionEntidad getAvion() {
        return avion;
    }
    public void setAvion(AvionEntidad avion) {
        this.avion = avion;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public String getOrigen() {
        return origen;
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }


}
