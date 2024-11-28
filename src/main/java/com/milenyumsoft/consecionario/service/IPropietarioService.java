package com.milenyumsoft.consecionario.service;

import com.milenyumsoft.consecionario.model.Propietario;

import java.util.List;

public interface IPropietarioService {

    public List<Propietario> traerPropietarios();

    public Propietario traerPropietario(Long id);

    public void crearPropietario(Propietario propietario);

    public void elimnarPropietario(Long id);

    public void editarPropietario(Long idOriginal, Long idNuevo, String nombre, String apellido, String dni);

    public Propietario editarPropietario(Propietario propietario);

}
