package com.PyJVuelos.persistencia.repositorio.interfaces;

import com.PyJVuelos.persistencia.modelos.entidades.UsuarioEntidad;

public interface IRepositorioUsuario {
    UsuarioEntidad guardarUsuario(UsuarioEntidad usuario);
    UsuarioEntidad buscarUsuarioPorEmail(String email);

}
