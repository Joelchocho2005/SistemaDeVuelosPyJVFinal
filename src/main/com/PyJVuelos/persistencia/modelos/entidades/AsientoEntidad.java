package com.PyJVuelos.persistencia.modelos.entidades;

import com.PyJVuelos.persistencia.modelos.entidades.enums.TipoDeAsiento;

public class AsientoEntidad {
    private int idAsiento;
    private String fila;
    private int columna;
    private TipoDeAsiento tipoDeAsiento;

    public AsientoEntidad(int idAsiento, String fila, int columna, TipoDeAsiento tipoDeAsiento) {
        this.idAsiento = idAsiento;
        this.fila = fila;
        this.columna = columna;
        this.tipoDeAsiento = tipoDeAsiento;
    }

    public int getIdAsiento() {
        return idAsiento;
    }

    public void setIdAsiento(int idAsiento) {
        this.idAsiento = idAsiento;
    }

    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public TipoDeAsiento getTipoDeAsiento() {
        return tipoDeAsiento;
    }

    public void setTipoDeAsiento(TipoDeAsiento tipoDeAsiento) {
        this.tipoDeAsiento = tipoDeAsiento;
    }
}
