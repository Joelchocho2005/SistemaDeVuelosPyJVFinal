package com.PyJVuelos.persistencia.modelos.entidades;

import java.util.List;

public class AvionEntidad {

    private int id;
    private boolean disponibilidad;
    private List <AsientoEntidad> listaAsientos;

     public AvionEntidad(int id, boolean disponibilidad , List <AsientoEntidad> listaAsientos){

         this.disponibilidad=disponibilidad;
         this.listaAsientos=listaAsientos;

     }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
