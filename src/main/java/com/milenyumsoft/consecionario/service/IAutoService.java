package com.milenyumsoft.consecionario.service;

import com.milenyumsoft.consecionario.model.Auto;

import java.util.List;

public interface IAutoService {


    public void crearAuto(Auto auto);

    public List<Auto> traerAutos();

    public void eliminarAuto(Long id);

    public void editarAuto(Long idOriginal,Long idNuevo, String marcaNuevo, String modeloNuevo, String patenteNuevo, String anioNuevo);

    public Auto editarAuto(Auto auto);
}
