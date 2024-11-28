package com.milenyumsoft.consecionario.service;

import com.milenyumsoft.consecionario.model.Auto;

import java.util.List;

public class AutoService implements IAutoService {

    @Override
    public void crearAuto(Auto auto) {

    }

    @Override
    public List<Auto> traerAutos() {
        return List.of();
    }

    @Override
    public void eliminarAuto(Long id) {

    }

    @Override
    public void editarAuto(Long idOriginal, Long idNuevo, String marcaNuevo, String modeloNuevo, String patenteNuevo, String anioNuevo) {

    }

    @Override
    public Auto editarAuto(Auto auto) {
        return null;
    }
}
