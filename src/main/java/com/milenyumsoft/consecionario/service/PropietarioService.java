package com.milenyumsoft.consecionario.service;

import com.milenyumsoft.consecionario.model.Auto;
import com.milenyumsoft.consecionario.model.Propietario;
import com.milenyumsoft.consecionario.repository.IPropietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropietarioService implements IPropietarioService {

    @Autowired
    private IPropietarioRepository propietarioRepository;

    @Override
    public List<Propietario> traerPropietarios() {

        return propietarioRepository.findAll();
    }

    @Override
    public Propietario traerPropietario(Long id) {
        return propietarioRepository.findById(id).get();
    }

    @Override
    public void crearPropietario(Propietario propietario) {
        propietarioRepository.save(propietario);
    }

    @Override
    public void elimnarPropietario(Long id) {
        propietarioRepository.deleteById(id);
    }

    @Override
    public void editarPropietario(Long idOriginal, Long idNuevo, String nombre, String apellido, String dni, Auto auto) {

       Propietario propietario= this.traerPropietario(idOriginal);
        propietario.setIdPropietario(idNuevo);
        propietario.setNombre(nombre);
        propietario.setApellido(apellido);
        propietario.setDni(dni);
        propietario.setUnAuto(auto);

        propietarioRepository.save(propietario);

    }

    @Override
    public Propietario editarPropietario(Propietario propietario) {

        this.crearPropietario(propietario);

        Propietario propi = propietarioRepository.findById(propietario.getIdPropietario()).get();
        return propi;



    }
}
