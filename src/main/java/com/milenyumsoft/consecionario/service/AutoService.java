package com.milenyumsoft.consecionario.service;

import com.milenyumsoft.consecionario.model.Auto;
import com.milenyumsoft.consecionario.repository.IAutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoService implements IAutoService {

    @Autowired
    private IAutoRepository autoRepository;

    @Override
    public void crearAuto(Auto auto) {
     autoRepository.save(auto);
    }

    @Override
    public List<Auto> traerAutos() {
        return autoRepository.findAll();
    }
    @Override
    public Auto traerAuto(Long id) {
        return autoRepository.findById(id).get();
    }

    @Override
    public void eliminarAuto(Long id) {
    autoRepository.deleteById(id);
    }

    @Override
    public void editarAuto(Long idOriginal, Long idNuevo, String marcaNuevo, String modeloNuevo, String patenteNuevo, String anioNuevo) {

        Auto auto = this.traerAuto(idOriginal);
        auto.setId(idNuevo);
        auto.setMarca(marcaNuevo);
        auto.setModelo(modeloNuevo);
        auto.setPatente(patenteNuevo);
        auto.setAnio(anioNuevo);
        autoRepository.save(auto);

    }

    @Override
    public void editarAuto(Auto auto) {

         this.crearAuto(auto);


    }
}
